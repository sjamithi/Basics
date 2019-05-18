import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPermutationOfAnother {
    private boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 1));
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c)+1);
//            } else {
//                map.put(c, 1);
//            }
        }

        for(char c: s2.toCharArray()) {
            if(map.containsKey(c))
                map.remove(c);
        }

        if(!map.isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.next();
        System.out.println("Enter another string");
        String s2 = sc.next();
        StringPermutationOfAnother stringPermutationOfAnother = new StringPermutationOfAnother();
        String output = stringPermutationOfAnother.isPermutation(s1, s2) ? "Yes": "No";
        System.out.println(output);
    }
}
