import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    private static List<Integer> findAnagramsIndices(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int pLen = p.length(), sLen = s.length();

        for (int i=0; i<=sLen-pLen; i++) {
            if (isAnagram(s.substring(i, i + pLen), p)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isAnagram(String a, String b) {
         /*char aArray[] = a.toCharArray();
         char bArray[] = b.toCharArray();
         Arrays.sort(aArray);
         Arrays.sort(bArray);
         return Arrays.equals(aArray, bArray);*/
         int[] dict = new int[26];
         for (char c: a.toCharArray()) {
             dict[c - 'a']++;
         }

         for (char c: b.toCharArray()) {
             if (--dict[c - 'a'] < 0)
                 return false;
         }
         return true;
    }

    public static void main(String[] args) {
       String s = "cbaebabacd", p = "abc";
       List<Integer> res = findAnagramsIndices(s, p);
       res.forEach(System.out::println);
    }
}
