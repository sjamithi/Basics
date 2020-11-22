package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        heap.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            Map.Entry<Character, Integer> entry = heap.poll();

            int i=0;
            while (i < entry.getValue()) {
                sb.append(entry.getKey());
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "Abbbaa";
        System.out.println(frequencySort(input));
    }
}
