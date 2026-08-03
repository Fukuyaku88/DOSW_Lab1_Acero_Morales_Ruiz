import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Challenge5 {

    //Student A
    private static HashSet<Integer> hashSetArmy(HashSet<Integer> hash_set) {
        return hash_set.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toCollection(HashSet::new));
    }

    //Student B
    private static TreeSet<Integer> TreeSetArmy(TreeSet<Integer> tree_set) {
        return tree_set.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    public static void main(String[] args) {

        HashSet<Integer> hash_set = new HashSet<Integer>();

        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            hash_set.add(random.nextInt(0,401));
        } //Random integers in HashSet, made here out of Method A just for clean code

        TreeSet<Integer> tree_set = new TreeSet<Integer>();

        for (int i = 0; i < 11; i++) {
            tree_set.add(random.nextInt(0,401));
        } //Random integers in TreeSet, made here out of Method B just for clean code

        HashSet<Integer> input_hash_set = new HashSet<>(
                Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5)
        );

        TreeSet<Integer> input_tree_set = new TreeSet<>(
                Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4)
        );

        HashSet<Integer> answerInputHashSet = hashSetArmy(input_hash_set);
        TreeSet<Integer> answerInputTreeSet = TreeSetArmy(input_tree_set);

        HashSet<Integer> answerRandomHashSet = hashSetArmy(hash_set);
        TreeSet<Integer> answerRandomTreeSet = TreeSetArmy(tree_set);

        System.out.println("Input HashSet");
        answerInputHashSet.forEach(num -> System.out.println("Number in the arena: " + num));

        System.out.println("\n");

        System.out.println("Input TreeSet");
        answerInputTreeSet.forEach(num -> System.out.println("Number in the arena: " + num));

        System.out.println("\n");

        System.out.println("Random HashSet");
        answerRandomHashSet.forEach(num -> System.out.println("Number in the arena: " + num));

        System.out.println("\n");

        System.out.println("Random TreeSet");
        answerRandomTreeSet.forEach(num -> System.out.println("Number in the arena: " + num));
    }
}