import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    // Both Collections
    private static Set<Integer> mergeCollections(Set<Integer> sA, Set<Integer> sB){
        return Stream.concat(sA.stream(), sB.stream())
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

        System.out.println("Hash Set 1: " + hash_set);
        System.out.println("Tree Set 1" + tree_set);
        System.out.println("\n" + "Merged Collections 1: " + "\n");
        mergeCollections(hash_set, tree_set).
                forEach(val ->
                        System.out.println("Number in the arena: " + val));


        HashSet<Integer> input_hash_set = new HashSet<>(
                Arrays.asList(4, 9, 15, 7, 18, 21, 10, 5)
        );
        TreeSet<Integer> input_tree_set = new TreeSet<>(
                Arrays.asList(12, 3, 25, 10, 7, 30, 18, 4)
        );

        System.out.println("\n\nHash Set 2: " + hash_set);
        System.out.println("Tree Set 2: " + tree_set);
        System.out.println("\n" + "Merged Collections 2: " + "\n");
        mergeCollections(hash_set, tree_set).
                forEach(val ->
                        System.out.println("Number in the arena: " + val));
    }
}