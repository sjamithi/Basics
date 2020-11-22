package Strings;

import java.util.*;

public class GroupShiftedStrings {
    public static List<List<String>> groupStrings(String[] strings) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strings) {
            String key = getKey(str);
            map.computeIfAbsent(key, t -> new LinkedList<>()).add(str);
        }

        res.addAll(map.values());
        return res;
    }

    private static String getKey(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int k = (s.charAt(i) - c) < 0 ? s.charAt(i) - c + 26 : s.charAt(i)-c;
            sb.append(k);
            c = s.charAt(i);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String[] arr = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};
        System.out.println(groupStrings(arr));
    }
}
