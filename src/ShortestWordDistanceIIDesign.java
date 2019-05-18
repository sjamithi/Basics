import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ShortestWordDistanceIIDesign {
    private Map<String, LinkedList<Integer>> map;
    private ShortestWordDistanceIIDesign(String[] words) {
        map = new HashMap<>();
        for (int i=0; i<words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], new LinkedList<>());
            }
            map.get(words[i]).add(i);
        }
    }

    private int shortest(String word1, String word2) {
    int min = Integer.MAX_VALUE, i1 = 0, i2=0;
    LinkedList list1 = map.get(word1);
    LinkedList list2 = map.get(word2);

    while(i1 < list1.size() && i2< list2.size()) {
        int w1 = (int)list1.get(i1);
        int w2 = (int)list2.get(i2);
        min = Math.min(min, Math.abs(w1 - w2));
        if (w1<w2) {
            i1++;
        } else {
            i2++;
        }
    }
    return min;
    }

    public static void main(String[] args) {
        String[] strs = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "makes";
        ShortestWordDistanceIIDesign shortestWordDistanceIIDesign = new ShortestWordDistanceIIDesign(strs);
        int n = shortestWordDistanceIIDesign.shortest(word1, word2);
        System.out.println(n);
    }
}
