package Strings;

public class PalindromicSubstrings {
    static int count = 0;
    public static int countSubstrings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        for (int i = 0; i< s.length(); i++) {
            countSubstrings(s, i, i);
            countSubstrings(s, i, i+1);
        }
        return count;
    }

    private static void countSubstrings(String s, int i, int j) {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count ++;
            i--;
            j++;
        }
    }

    public static void main(String[] args) {
        String inp = "abc";
        System.out.println(countSubstrings(inp));
    }
}
