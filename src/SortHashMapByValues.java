import java.util.*;

public class SortHashMapByValues {

    private static Map sortByValue(Map<String, Integer> map) {
        Map<String, Integer> res = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> list = new LinkedList<>();
        list.addAll(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for (Map.Entry<String, Integer> entry: list) {
            res.put(entry.getKey(), entry.getValue());
        }

        return res;
    }
    public static void main(String[] args)
    {
        Map<String, Integer> hm = new HashMap();

        // enter data into hashmap
        hm.put("Math", 98);
        hm.put("Data Structure", 85);
        hm.put("Database", 91);
        hm.put("Java", 95);
        hm.put("Operating System", 79);
        hm.put("Networking", 80);
        Map<String, Integer> hm1 = sortByValue(hm);

        // print the sorted hashmap
        for (Map.Entry<String, Integer> en : hm1.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }
    }
}
