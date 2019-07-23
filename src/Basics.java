import java.util.*;

public class Basics {

    public int getX() {
        return x;
    }

    private static void kesha() {
        String[] words = {"kavya", "kesha", "kosha", "KAVYA", "KosHa"};
        Map<String, Integer> map = new HashMap<>();

        for (String word: words) {
            if (map.containsKey(word.toLowerCase())) {
                int c = map.get(word.toLowerCase());
                c = c+1;
                map.put(word.toLowerCase(), c);
            } else {
                map.put(word.toLowerCase(), 1);
            }
        }
        System.out.println(map);
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;
    Basics(int x) {
        this.x = x;
    }

    private static List<String> topK(String[] strs, int k) {
        List<String> res = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();
        for (String s:  strs) {
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> !Objects.equals(a, b) ? map.get(b) - map.get(a) : a.compareTo(b));
        heap.addAll(map.keySet());

        while (k > 0) {
            res.add(heap.poll());
            k--;
        }
        System.out.println(res);
        return res;
    }

    public static void topFrequentK(int[] arr, int k) {
        Map<Integer, Integer> ma = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (int i: arr) {
            ma.put(i, ma.getOrDefault(i, 0) +1);
        }

        heap.addAll(ma.entrySet());

        while (res.size() < k) {
            Map.Entry<Integer, Integer> entry = heap.poll();
            res.add(entry.getKey());
        }

        res.stream().forEach(l -> System.out.printf(l + " "));

    }

    public static void main(String[] args) {
        Basics b = new Basics(0);
        b.getX();

        String[] arr = {"Hi", "this", "is", "Sandeep", "Hi", "is", "is"};
        topK(arr, 2);

        int[] nums = new int[] {1,1,1,2,2,3};
        int k = 2;
        topFrequentK(nums, k);
        kesha();
    }
}
