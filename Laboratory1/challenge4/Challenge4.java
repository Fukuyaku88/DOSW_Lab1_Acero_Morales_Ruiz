import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge4{

    public static HashMap<String, Integer> treasureDuplicateKeysHmap (List<Map.Entry<String, Integer>> entries){
        if(entries == null) return new HashMap<>();

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }

    public static Hashtable<String, Integer> treasureDuplicateKeysHtable (List<Map.Entry<String, Integer>> entries){
        Hashtable<String, Integer> hashT = entries.stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        Hashtable::new
                ));

        return hashT;
    }

    public static Map<String, Integer> mergeBothMaps(Map<String, Integer> hashM, Map <String, Integer> hashT){
        if(hashM == null) hashM = Map.of();
        if(hashT == null) hashT = Map.of();

        return Stream.concat(
                hashM.entrySet().stream(),
                hashT.entrySet().stream()
        )
                .collect(Collectors.toMap(
                        entry -> entry.getKey().toUpperCase(),
                        Map.Entry::getValue,
                        (valHash, valTable) -> valTable,
                        TreeMap::new
                ));
    }

    public static void main(String[] args){

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
    }
}