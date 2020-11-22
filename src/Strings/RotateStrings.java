package Strings;

import java.util.Arrays;

public class RotateStrings {
    public static boolean rotateString(String A, String B) {
        if (A == null && B == null)
            return true;

        if (A == null || B == null)
            return false;

        char [] aArr = A.toCharArray();
        char [] bArr = B.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        return Arrays.equals(aArr, bArr);
    }

    private static boolean optimizedAndCorrect (String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    public static void main(String[] args) {
        String A = "abcde", B = "cdeab";
        System.out.println(rotateString(A, B));
        System.out.println(optimizedAndCorrect(A, B));
    }
}
