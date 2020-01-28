package Strings;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[] chars = new int[26];

        if (s.length() != t.length())
            return false;

        for (char c: s.toCharArray()) {
            chars[c - 'a']++;
        }

        for (int i=0; i< t.length(); i++) {
            if (-- chars[t.charAt(i) - 'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "ab", t = "a";
        System.out.println(isAnagram(s, t));
    }
}
