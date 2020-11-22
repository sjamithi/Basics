package Strings;

public class PalindromeII {
    private static boolean isValidPalindrome(String inp) {
        int i=0, j=inp.length()-1;

        while (i < j) {
            if (inp.charAt(i) != inp.charAt(j)) {
                return isPalindrome(inp, i+1, j) || isPalindrome(inp,i, j-1);
            }
            i++;
            j--;
        }

        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String Input= "abbaa";
        System.out.println(isValidPalindrome(Input));
    }
}
