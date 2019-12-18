package Strings;

import java.util.LinkedHashMap;
import java.util.Map;


// TODO Try again
public class LongestSubstringWithKCharacters {
    private static boolean longestSubstring(String s, int k) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 1) +1);
        }

        for (int i: map.values()) {
            return i >= k;
        }
        return false;
    }

    private static int longestSubstringLength (String s, int k) {
        int t = s.length();
        while (t >= k) {
            for (int i = 0; i < s.length() - t; i++) {
                if (longestSubstring(s.substring(i, i+t), k)) {
                    return t;
                }
            }
            t--;
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        System.out.println(longestSubstringLength(s, k));
    }
}
