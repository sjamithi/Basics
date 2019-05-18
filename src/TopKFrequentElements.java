import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    private static List<Integer> topK(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for (int i: arr) {
           map.put(i, map.getOrDefault(i, 0)+1);
        }

        heap.addAll(map.entrySet());

        while (list.size() < k) {
            Map.Entry<Integer, Integer> entry = heap.poll();
            list.add(entry.getKey());
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k=2;
        System.out.println(topK(arr, k));
    }

}
