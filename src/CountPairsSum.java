import java.util.HashMap;
import java.util.Map;

public class CountPairsSum {
    private static int count(int[] arr, int K) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (int i: arr) {
            if (map.containsKey(K- i)) {
                count += map.get(K-i);
            }
            if (K -i == i)
                count--;
        }

        return count/2;
    }
    public static void main(String[] args) {
        int X = 6;
        int arr[] = new int[]{1, 5, 7, -1, 5};
        System.out.println(count(arr, X));
    }
}

