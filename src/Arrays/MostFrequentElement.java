package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    private static int mostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1, ans = -1;
        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,4,1,5,6,4,1,4,5,4, 1, 4};
        System.out.println(mostFrequent(arr));
    }
}
