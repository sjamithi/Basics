package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindAllAnagramsInAString {

   private static int[] chars = new int[26];
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new LinkedList<>();
        int pl = p.length();
        for (char c: p.toCharArray()) {
            chars[c - 'a']++;
        }
      for (int i = 0; i < s.length() - p.length(); i++) {
//          if (isAnagramSort(s.substring(i, i+pl), p))
          if (isAnagram(s.substring(i, i + p.length())))
          res.add(i);
      }
      return res;
    }

    private static boolean isAnagram(String s) {
            int[] schars = new int[26];
            for (char c: s.toCharArray()) {
                schars[c - 'a']++;
            }
            return Arrays.equals(chars, schars);
    }

    private static boolean isAnagramSort(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return Arrays.equals(arrA, arrB);
    }

    private static boolean isAnagram(String s, String p) {
        int[] chars = new int[26];

        for (char c: p.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c: s.toCharArray()) {
            if (-- chars[c - 'a'] < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s= "cbaebabacd", p= "abc";

        System.out.println(findAnagrams(s, p));
    }
}
