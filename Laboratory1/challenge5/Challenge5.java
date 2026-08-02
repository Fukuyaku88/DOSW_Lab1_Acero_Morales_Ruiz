import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Challenge5 {

    public static Set<Integer> battleOfSets() {

        HashSet<Integer> army = new HashSet<>(
                Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5)
        );

        return army.stream()
                .filter(number -> number % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        Set<Integer> result = battleOfSets();

        result.forEach(number ->
                System.out.println("Number in the arena: " + number)
        );

    }
}