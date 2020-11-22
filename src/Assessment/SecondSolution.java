package Assessment;

import java.util.*;

public class SecondSolution {

    private static int solution(String s) {
        if (s == null || s.trim().length() == 0)
            return 0;

        Map<Character, Integer> charMap = new HashMap<>();

        for (char c: s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) +1);
        }

        if (charMap.size() == 1) {
            return 0;
        }

        if (charMap.size() == s.length()) {
            return 0;
        }


        System.out.println(charMap);
        int result = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char c: charMap.keySet()) {
            if (charMap.get(c) > max) {
                max = charMap.get(c);
            }

            if (charMap.get(c) < min) {
                min = charMap.get(c);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        String s = "aaaabbbb";
        System.out.println(solution(s));

        //Complexity of the program is
    }


}
