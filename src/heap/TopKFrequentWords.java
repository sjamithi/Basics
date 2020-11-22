package heap;

import java.util.*;

public class TopKFrequentWords {
    private static List<String> topk(String[] arr, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String s: arr) {
            map.put(s, map.getOrDefault(s, 0) +1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> !Objects.equals(map.get(a), map.get(b)) ? map.get(b) - map.get(a) : a.compareTo(b));

        heap.addAll(map.keySet());

        while(res.size() < k) {
            res.add(heap.poll());
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"i", "love", "programming", "i", "love", "coding"};
        int k=2;
        System.out.println(topk(arr, k));
    }
}
