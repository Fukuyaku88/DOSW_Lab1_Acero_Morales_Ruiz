import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Challenge4 {

        //Student A
    public static HashMap<String, Integer> treasureDuplicateKeysHmap (List<Map.Entry<String, Integer>> entries){
        if(entries == null) {
                return new HashMap<>();
        }

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }

    //Student B
    public static Hashtable<String, Integer> treasureDuplicateKeysHtable(List<Map.Entry<String, Integer>> entries) {

        if (entries == null) {
                return new Hashtable<>();
        }

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        Hashtable::new
                ));
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
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (valHash, valTable) -> valTable,
                        TreeMap::new
                ));
    }


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
    }
}