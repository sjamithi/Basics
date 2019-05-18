package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    //brute force technique where complexity is O(n^n)
    private static boolean bruteForce(List<String> dict, String s) {
        return bruteForce(new HashSet(dict), s, 0);
    }

    private static boolean bruteForce(Set<String> dict, String s, int start) {
        if (start == s.length()) {
            return true;
        }

        for (int end = start +1; end <= s.length(); end ++) {
            if (dict.contains(s.substring(start, end)) && bruteForce(dict, s, end))
            return true;
        }

        return false;
    }

    //memoization where complexity is O(n^2)
    private static boolean memoization(List<String> dict, String s) {
        return memoization(new HashSet(dict), s, 0, new boolean[s.length()]);
    }

    private static boolean memoization(Set<String> dict, String s, int start, boolean[] memo) {
        if (start == s.length())
            return true;
        if (memo[start])
            return memo[start];
        for (int end = start +1; end <= s.length(); end++) {
            if (dict.contains(s.substring(start, end)) && memoization(dict, s, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }

    //Dynamic programming where complexity is O(n^2)
    private static boolean dp(List<String> dict, String s) {
        Set<String> wordDict = new HashSet(dict);
        boolean[] dp = new boolean[s.length()+1];

        dp[0] = true;

        for (int i=1; i<=s.length(); i++) {
            for (int j=0; j<i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> dict = Arrays.asList("leet", "code");
        System.out.println(bruteForce(dict, s));
        System.out.println("memo " + memoization(dict, s));
        System.out.println("dp " + dp(dict, s));
    }
}
