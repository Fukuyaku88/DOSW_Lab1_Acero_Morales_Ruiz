import java.util.*;
import java.util.stream.Collectors;


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
    public static Hashtable<String, Integer> treasureDuplicateKeysHtable(List<Map.Entry<String, Integer>> entries) {

        if (entries == null)
            return new Hashtable<>();

        return entries.stream()
                .filter(e -> e.getKey() != null && e.getValue() != null)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        Hashtable::new
                ));
    }


    public static void main(String[] args){

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("gold", 12);
        hashMap.put("silver", 5);
        hashMap.put("ruby", 4);

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("gold", 15);
        hashTable.put("emerald", 6);
        hashTable.put("silver", 8);

        System.out.println("HashMap:");
        System.out.println(
                treasureDuplicateKeysHmap(new ArrayList<>(hashMap.entrySet()))
        );

        System.out.println();

        System.out.println("Hashtable:");
        System.out.println(
                treasureDuplicateKeysHtable(new ArrayList<>(hashTable.entrySet()))
        );
    }
}