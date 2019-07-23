import java.util.*;
import java.util.stream.Collectors;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer>map = new LinkedHashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        String[] words = paragraph.split("[^A-Za-z0-9]");
        for (String s : words) {
            if(s.length()>0)
            map.put(s.toLowerCase(), map.getOrDefault(s.toLowerCase(), 0) +1 );
        }

        heap.addAll(map.entrySet());

        List<String> list = Arrays.asList(banned);
        list = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());

        int i=0;
        int s = heap.size();
        while (heap.size() > 0 && i<s) {
            if (list.contains(heap.peek().getKey())) {
                heap.poll();
                i++;
            } else {
                return heap.poll().getKey();
            }
        }
        return "";
    }

    public static void main(String[] args) {
       String paragraph =   "abc abc? abcd the jeff!";
       String[] banned ={"abc","abcd","jeff"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
