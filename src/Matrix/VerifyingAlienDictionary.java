package Matrix;

public class VerifyingAlienDictionary {
    private static boolean isAlien(String[] words, String order) {

        //Complexity is O(n^2) * O(26)
        //Space complexity is constant as  O(26)

     int[] alphabet = new int[26];

     for (int i = 0; i< order.length(); i++) {
         alphabet[order.charAt(i) - 'a'] = i;
     }
     int j;
     for (int i = 0; i < words.length-1; i++) {
         j = i+1;
         int  min = Math.min(words[i].length(), words[j].length());

         for (int k = 0; k < min; k ++) {
             int ichar = words[i].charAt(k) - 'a';
             int jchar = words[j].charAt(k)- 'a';

             if (alphabet[ichar] < alphabet[jchar]) {
                 break;
             }

             else if (alphabet[ichar] > alphabet[jchar]) {
                 return false;
             }

            else if (k == min-1 && words[i].length() > words[j].length())
                 return false;
         }
     }

     return true;
    }
    public static void main(String[] args) {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefghijklmnopqrstuvwxyz";
        System.out.println(isAlien(words, order));
    }
}
