import java.util.*;

public class GroupAnagrams {
    private static char[] sort(String s) {
        char[] cArr = s.toCharArray();
        Arrays.sort(cArr);
        return cArr;
    }
    private static List<List<String>> group(String[] strs) {
        Map<String, List<String>> hashTable = new HashMap<>();
        for (String s: strs) {
            String temp = String.valueOf(sort(s));
            if (hashTable.containsKey(temp)) {
                List<String> list = hashTable.get(temp);
                list.add(s);
            } else {
                hashTable.put(temp, new ArrayList<>());
                hashTable.get(temp).add(s);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for (List<String> list: hashTable.values()) {
            res.add(list);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(strs));
    }
}
