import java.util.*;

public class Basics {

    public int getX() {
        return x;
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

    public static void main(String[] args) {
        Basics b = new Basics(0);
        b.getX();

        String[] arr = {"Hi", "this", "is", "Sandeep", "Hi", "is", "is"};
        topK(arr, 2);
    }
}
