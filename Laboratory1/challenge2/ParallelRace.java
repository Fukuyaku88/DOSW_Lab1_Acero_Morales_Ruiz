import java.util.List;
import java.util.function.Function;

public class ParallelRace {

    // Lane One
    // Receives a list of numbers and returns the largest number
    public static Function<List<Integer>, Integer> getMax = numbers ->
            numbers.stream()
                    .max(Integer::compareTo)
                    .orElse(Integer.MIN_VALUE);

    public static void main(String[] args) {

        List<Integer> numbers = List.of(32, 25, 2, 5252, 5, 25, 27, 654, 7421, 86);

        int max = getMax.apply(numbers);

        System.out.println("Maximum value: " + max);
    }
}