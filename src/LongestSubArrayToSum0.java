import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayToSum0 {
    private int maxLen(int[] arr) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];

            if (sum == 0)
                max = i+1;
            else if (map.containsKey(sum))
                max = Math.max(max, i - map.get(sum));
            if (!map.containsKey(sum))
                map.put(sum, i);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8,8, 7, 10, 23};
        LongestSubArrayToSum0 l = new LongestSubArrayToSum0();
        System.out.println(l.maxLen(arr));
    }
}
