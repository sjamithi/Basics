package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubArraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i< nums.length; i++) {
            sum += nums[i];

            sum = sum % k;

            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else {
                map.put(sum, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {23, 2, 4, 6, 7};
        int k=6;
        System.out.println(checkSubarraySum(arr, k));
    }
}
