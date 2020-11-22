package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LargestNumberXRepeatX {
    private static int repeatX(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for (int i: arr) {
            map.put(i, map.getOrDefault(i, 0) +1);
        }

        for (Map.Entry entry: map.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                ans = Math.max(ans, (int)entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] x = {7,1,2,8,2};
        System.out.println(repeatX(x));
    }
}
