import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueCharacterInString {
    private static int unique(String s) {
        int[] chars = new int[26];
        int o = -1;
        for (int i=0; i<s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i=0; i<s.length(); i++) {
            if(chars[s.charAt(i) - 'a'] == 1) {
                o = i;
                break;
            }
        }
        return  o;
    }

    private static Character usingHashMap(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        Character target = '0';
        for (char c: s.toCharArray()) {
//            if (map.containsKey(c)) {
//                map.put(c, map.get(c) + 1);
//            } else {
//                map.put(c, 1);
//            }
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for (Character c: map.keySet()) {
            if (map.get(c) == 1) {
                target = c;
                break;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(unique(a));
        System.out.println(usingHashMap(a));
    }
}
