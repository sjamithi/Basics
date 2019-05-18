public class LongestPalindromeSubstring {
    private String lps(String s) {
        if (s == null || s.length() == 0)
            return s;
        String longest = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            String temp = helper(s, i, i);
            if (temp.length() > longest.length())
                longest = temp;
            temp = helper(s, i, i+1);
            if (temp.length() > longest.length())
                longest = temp;
        }
        return longest;
    }

    private String helper(String s, int begin, int end) {
        while(begin >=0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin --;
            end ++;
        }
        return s.substring(begin + 1, end);
    }
    public static void main(String[] args) {
        String testString = "";
        LongestPalindromeSubstring lps = new LongestPalindromeSubstring();
        System.out.println("Longest palindrome of the given string is : " + lps.lps(testString));
    }
}
