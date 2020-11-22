package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    private static List<Integer> topK(int[] arr, int k) {
        List<Integer> res= new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<>();

       for (int i: arr) {
           map.put(i, map.getOrDefault(i, 0) +1);
       }

       PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

       heap.addAll(map.entrySet());

       while (k > 0) {
           res.add(heap.poll().getKey());
           k--;
       }
       return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k=2;
        System.out.println(topK(arr, k));
    }

}
