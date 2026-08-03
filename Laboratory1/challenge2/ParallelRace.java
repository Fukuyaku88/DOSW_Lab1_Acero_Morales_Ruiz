import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ParallelRace {

    // Container (easier that create the object gets and constructors) java v14
    public record SingleListStats (
            int max,
            int min,
            int total,
            boolean max_multiple_of_two,
            boolean total_divisible_by_two
    ){}

    // Only resolves the stats of a single list
    public static Function<List<Integer>, SingleListStats> singleSolver = numbers -> {
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE); // Or 0
        int total = numbers.size();
        boolean max_multiple_of_two = (max % 2 == 0);
        boolean total_divisible_by_two = (min % 2 == 0);

        return new SingleListStats(max, min, total, max_multiple_of_two, total_divisible_by_two);
    };

    //Container
    public record Results(
        SingleListStats list1Stats,
        SingleListStats list2Stats
    ){}

    // Master of joining between both singleSolver
    public static BiFunction<List<Integer>, List<Integer>, Results> bothLists = (l1, l2) ->
            new Results(singleSolver.apply(l1), singleSolver.apply(l2));


    public static void main(String[] args){
        List<Integer> nums1 = List.of(32,25,2,5252,5,25,25,25,27,654,7421,86);
        List<Integer> nums2 = List.of(2,5,2,64,6436,8,-6,9964,0,9589,9,653,98765);

        Results ans = bothLists.apply(nums1, nums2);

        System.out.println("Max: " + ans.list1Stats().max());
        System.out.println("Min: " + ans.list1Stats().min());
        System.out.println("Total: " + ans.list1Stats().total());
        System.out.println("IsMaxMulOfTwo: " + ans.list1Stats().max_multiple_of_two);
        System.out.println("IsSizeEven: " + ans.list1Stats().total_divisible_by_two);

        System.out.println("\n");

        System.out.println("List 2 stats:");
        System.out.println("Max: " + ans.list2Stats().max());
        System.out.println("Min: " + ans.list2Stats().min());
        System.out.println("Total: " + ans.list2Stats().total());
        System.out.println("IsMaxMulOfTwo: " + ans.list2Stats().max_multiple_of_two);
        System.out.println("IsSizeEven: " + ans.list2Stats().total_divisible_by_two());
    }
}