import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class JewelsAndStones {
    private static int numJewelsInStones(String J, String S) {
        Map<Character, Integer> hash = new HashMap<>();

        for(char c: S.toCharArray()) {
            if (J.indexOf(c) != -1)
            hash.put(c, hash.getOrDefault(c, 0)+1);
        }
        int count=0;
        for (int i: hash.values())
            count += i;
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));

    }
}
