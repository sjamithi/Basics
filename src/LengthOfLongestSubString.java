import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubString {
    private int lengthOfLongest(String s) {
        int n = s.length(), j = 0, i = 0, ans = 0;
        Set<Character> hash = new HashSet<>();
        while (i < n && j < n) {
            if (!hash.contains(s.charAt(j))) {
                hash.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                hash.remove(s.charAt(i ++));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aabbccccdefg";
        LengthOfLongestSubString lls = new LengthOfLongestSubString();
        System.out.println(lls.lengthOfLongest(str));
    }
}
