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

    public static void main(String[] args){

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("gold", 12);
        hashMap.put("silver", 5);
        hashMap.put("ruby", 4);

        System.out.println(treasureDuplicateKeysHmap(new ArrayList<>(hashMap.entrySet())));
    }
}