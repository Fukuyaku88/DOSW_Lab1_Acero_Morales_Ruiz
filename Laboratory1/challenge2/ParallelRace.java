import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    // Container (easier that create the object gets and constructors) java v14
    public record SingleListStats (
            int max,
            int min,
            int total,
            boolean max_multiple_of_two,
            boolean min_divisible_by_two
    ) {}

    // Only resolves the stats of a single list
    public static Function<List<Integer>, SingleListStats> singleSolver = numbers -> {
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
        int min = numbers.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MAX_VALUE); // Or 0
        int total = numbers.size();

        boolean max_multiple_of_two = max % 2 == 0? true: false;

        boolean min_divisible_by_two = min % 2 == 0? true: false;

        return new SingleListStats(max, min, total, max_multiple_of_two, min_divisible_by_two);
    };

    public static void main(String[] args){
        List<Integer> nums1 = List.of(32,25,2,5252,5,25,25,25,27,654,7421,86);
        List<Integer> nums2 = List.of(2,5,2,64,6436,8,-6,9964,0,9589,9,653,98765);

        SingleListStats ans = singleSolver.apply(nums1);

        System.out.println("List 1 stats:");
        System.out.println("Max: " + String.valueOf(ans.max()));
        System.out.println("Min: " + String.valueOf(ans.min()));
        System.out.println("Total: " + String.valueOf(ans.total()));
        System.out.println("IsMaxMulOfTwo: " + String.valueOf(ans.max_multiple_of_two()));
        System.out.println("IsMinDivByTwo: " + String.valueOf(ans.min_divisible_by_two()));

        System.out.println("\n");

        System.out.println("List 2 stats:");
        System.out.println("Max: " + "PUT HERE");
        System.out.println("Min: " + "PUT HERE");
        System.out.println("Total: " + "PUT HERE");
        System.out.println("IsMaxMulOfTwo: " + "PUT HERE");
        System.out.println("IsSizeEven: " + "PUT HERE");
    }
}