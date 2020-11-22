package Strings;

public class PalindromeWithSpaces {

    public  static String isPalindrome(String s) {

        if (s == null || s.length() == 0)
            return "Sentence is palindrome.";

        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (s.charAt(i) != s.charAt(j)) {
                return "Sentence is not palindrome.";
            }
            i++; j--;
        }
        return "Sentence is palindrome.";
    }

    public static void main(String[] args) {
        String str = "Abc def ghi jklm.";
        System.out.println(isPalindrome(str));
    }
}
