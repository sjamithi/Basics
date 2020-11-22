package Strings;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
      if (s == null || t == null)
          return "";

      int goal = t.length();
      Map<Character, Integer> tMap = new HashMap<>();
      int j = 0;

      for (char c: t.toCharArray()) {
          tMap.put(c, tMap.getOrDefault(c, 0) +1);
      }

      Map<Character, Integer> sMap = new HashMap<>();
      String res = "";
      int tot = 0, min = Integer.MAX_VALUE;

      for (int i = 0; i< s.length(); i++) {
          if (!tMap.containsKey(s.charAt(i))) {
              continue;
          }

          char c = s.charAt(i);
          int count = sMap.getOrDefault(c, 0);

          if (count < tMap.get(c)) {
            tot++;
          }

          sMap.put(c,count+1);

          if (tot == goal) {
              while (!tMap.containsKey(s.charAt(j)) || sMap.get(s.charAt(j)) > tMap.get(s.charAt(j))) {
                  char ch = s.charAt(j);
                  if (tMap.containsKey(ch) && sMap.get(ch) > tMap.get(ch)) {
                      sMap.put(ch, sMap.get(ch)-1);
                  }
                  j++;
              }

              if (min > i -j +1) {
                  min = i-j+1;
                  res = s.substring(j, i + 1);
              }
          }
      }

      return res;
    }
    public static void main(String[] args) {
        String  S = "ADOBECODEBANC", T = "ABC";
        System.out.println(minWindow(S, T));
    }
}
