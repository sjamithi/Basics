package GreedyAlgorithm;

import java.util.*;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        heap.addAll(map.entrySet());

        Queue<Map.Entry<Character, Integer>> list = new LinkedList<>();
        while (!heap.isEmpty()) {
          Map.Entry<Character, Integer> entry = heap.poll();
          sb.append(entry.getKey());
          entry.setValue(entry.getValue()-1);
          list.add(entry);

          if (list.size() > 1) {
            Map.Entry<Character, Integer> temp = list.poll();
            if (temp.getValue() > 0) {
                heap.offer(temp);
            }
          }
      }

        return sb.toString().length() == s.length() ? sb.toString(): "";
    }
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(reorganizeString(s));
    }
}
