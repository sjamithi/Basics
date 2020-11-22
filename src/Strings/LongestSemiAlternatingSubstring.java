package Strings;

public class LongestSemiAlternatingSubstring {

    private static String lengthOfLongestAlternateString (String s) {
        StringBuilder sb = new StringBuilder(s);
        int aCount = 0, bCount = 0;

        int j;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
                bCount = 0;
            }

            if (s.charAt(i) == 'b') {
                bCount++;
                aCount = 0;
            }

            if (aCount == 3 || bCount == 3) {
                    j = --i;
                    sb.deleteCharAt(j);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abaaaa";
        System.out.println(lengthOfLongestAlternateString(s));
    }
}
