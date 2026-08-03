import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

<<<<<<< HEAD
public class Challenge4 {

    public static HashMap<String, Integer> treasureDuplicateKeysHmap (List<Map.Entry<String, Integer>> entries){
        if(entries == null) return new HashMap<>();
=======

public class Challenge4 {

        //Student A
    public static HashMap<String, Integer> treasureDuplicateKeysHmap (List<Map.Entry<String, Integer>> entries){
        if(entries == null) {
                return new HashMap<>();
        }
>>>>>>> feature/challenge_4_Acero_Morales_Ruiz_2026-2

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }

<<<<<<< HEAD
    public static Hashtable<String, Integer> treasureDuplicateKeysHtable (List<Map.Entry<String, Integer>> entries){
        Hashtable<String, Integer> hashT = entries.stream()
=======
    //Student B
    public static Hashtable<String, Integer> treasureDuplicateKeysHtable(List<Map.Entry<String, Integer>> entries) {

        if (entries == null) {
                return new Hashtable<>();
        }

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
>>>>>>> feature/challenge_4_Acero_Morales_Ruiz_2026-2
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        Hashtable::new
                ));
<<<<<<< HEAD

        return hashT;
    }

    public static Map<String, Integer> mergeBothMaps(Map<String, Integer> hashM, Map <String, Integer> hashT){
        if(hashM == null) hashM = Map.of();
        if(hashT == null) hashT = Map.of();

        return Stream.concat(
                hashM.entrySet().stream(),
                hashT.entrySet().stream()
        )
=======
    }

    //Merge Goal
    public static TreeMap<String, Integer> mergeBothMaps(HashMap<String, Integer> hashM, Hashtable <String, Integer> hashT) {
        if(hashM == null) {
                hashM = new HashMap<>();
        }

        if(hashT == null) {
                hashT = new Hashtable<>();
        }

        return Stream.concat(
                        hashM.entrySet().stream(),
                        hashT.entrySet().stream())
>>>>>>> feature/challenge_4_Acero_Morales_Ruiz_2026-2
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (valHash, valTable) -> valTable,
                        TreeMap::new
                ));
    }
<<<<<<< HEAD

    public static void main(String[] args){

        List<Map.Entry<String, Integer>> listOfPairs = List.of(
                Map.entry("Apple", 10),
                Map.entry("Banana", 20),
                Map.entry("Apple", 50) // Clave duplicada
        );

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("gold", 12);
        hashMap.put("silver", 5);
        hashMap.put("ruby", 4);

        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("silver", 8);   // Duplicate key (overrides silver to 8)
        hashtable.put("diamond", 10);
        hashtable.put("emerald", 6);

        Map<String, Integer> mergedMap = mergeBothMaps(hashMap, hashtable);
        mergedMap.forEach((key, value) -> System.out.println(
                "Key: " + key + " | Value: " + value));
=======


    public static void main(String[] args){

        List<Map.Entry<String, Integer>> hashMap = List.of(
                Map.entry("gold", 5),
                Map.entry("silver", 3),
                Map.entry("gold", 7),
                Map.entry("diamond", 10)
        );

        List<Map.Entry<String, Integer>> hashtable = List.of(
                Map.entry("silver", 8),
                Map.entry("ruby", 4),
                Map.entry("gold", 12),
                Map.entry("esmerald", 6)
        );

        HashMap<String, Integer > studentA = treasureDuplicateKeysHmap(hashMap);
        Hashtable<String, Integer > studentB = treasureDuplicateKeysHtable(hashtable);
        TreeMap<String, Integer> mergeGoal = mergeBothMaps(studentA,studentB);

        System.out.println("HashMap:");
        studentA.forEach((k, v) -> System.out.println("Key: " + k + " | " + "Value: " + v));

        System.out.println();

        System.out.println("Hashtable:");
        studentB.forEach((k, v) -> System.out.println("Key: " + k + " | " + "Value: " + v));

        System.out.println();

        System.out.println("Final Merge between both types of maps:");
        mergeGoal.forEach((k, v) -> System.out.println("Key: " + k + " | " + "Value: " + v));
>>>>>>> feature/challenge_4_Acero_Morales_Ruiz_2026-2
    }
}