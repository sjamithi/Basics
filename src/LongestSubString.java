import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    private int lengthOfLongestSubString(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        for (char c: s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                max = Math.max(max, set.size());
            } else {
                set.remove(c);
            }
        }
        System.out.println(set);
        return max;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        LongestSubString longestSubString = new LongestSubString();
        System.out.println(longestSubString.lengthOfLongestSubString(s));
    }
}
