package Strings;

public class MinSwapsToMakePalindrome {

    private static int minSwaps (String s) {
        int swaps = 0;
        for (int i = 0; i< s.length()/2; i++) {

            int l = i, r = s.length() - l-1;
            while (l < r) {
                if (s.charAt(l) == s.charAt(r)) {
                    break;
                } else {
                    r--;
                }
                if (s.charAt(l) != s.charAt(r)) {
                    swap(s.toCharArray(), r, r-1);
                } else {
                    return -1;
                }
            }
        }

        return swaps;
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }


    private static boolean isPalindrome(String str) {
        int i = 0, j = str.length()-1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        //minimum number of adjacent swaps required to convert a string into a palindrome. If not possible, return -1
        String s = "mamad";
//        System.out.println(isPalindrome("mamad"));
        System.out.println(minSwaps(s));
    }
}
