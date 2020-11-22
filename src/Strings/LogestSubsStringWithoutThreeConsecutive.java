package Strings;

public class LogestSubsStringWithoutThreeConsecutive {
    // find longest substring of s such that s does not contain more than two contiguous occurrences of a and b.

    private static String logestSubString(String s) {
        char curr, prev = s.charAt(0);

        for (int i = 2; i < s.length(); i+=2) {
            curr = s.charAt(i);

            if (curr == prev) {
                return s.substring(0, i);
            } else {
                prev = curr;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String input = "aabbaabbaabbaa";
        System.out.println(logestSubString(input));
    }
}
