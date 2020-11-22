package Strings;

public class MinMovesNoThreeConsecutiveLetters {

    private static int minMoves(String s) {
        int swaps = 0;

        if (s == null || s.length() == 0) {
            return swaps;
        }

        int i, j;

        for (i=0; i< s.length(); ) {
            j = i;

            if (j < s.length() && s.charAt(i) == s.charAt(j)) {
                while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                    if (j - i == 2) {
                        swaps++;
                    }
                    j++;
                }
                i = j;
            } else {
                i++;
                j++;
            }
        }
        return swaps;
    }

    private static int easyMinMoves(String s) {
        int aCount = 0, bCount = 0, swaps = 0;

        for (char c: s.toCharArray()) {
            if (c == 'a') {
                aCount ++;
                bCount = 0;
            }
            if (c == 'b') {
                aCount = 0;
                bCount++;
            }

            if (aCount == 3 || bCount == 3) {
                swaps ++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        String s = "baabab";
        System.out.println(minMoves(s));
        System.out.println(easyMinMoves(s));
    }
}
