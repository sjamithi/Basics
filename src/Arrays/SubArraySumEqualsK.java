package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       int count = 0, sum = 0;

      for (int n: nums) {
          sum += n;

          if (sum == k)
              count += 1;

          if (map.containsKey(sum-k)) {
              count += map.get(sum-k);
          }
          map.put(sum, map.getOrDefault(sum, 0) +1);
      }
      return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1};
        int k = 3;
        System.out.println(subarraySum(nums, k));
    }
}
