package Strings;

public class Palindrome {

    private static boolean isPalindrome(String s) {
        s = s.trim().toLowerCase();
        if (s.length() == 0 || s.length() == 1)
            return true;

        int i=0, j = s.length() -1;

        while (i < j) {
            while (i<j &&!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i< j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
//        String str = "ab1231ba";
        System.out.println(isPalindrome(str));
    }
}
