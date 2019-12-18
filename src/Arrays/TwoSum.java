package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSum {
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int o=-1, t=-1;
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                o = i; t = map.get(target-nums[i]);
                return new int[] {o, t};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {o,t};
    }
    public static void main(String[] args) {
        int[] nums = {3,3}; int target = 6;
        int[] res = twoSum(nums, target);
        for (int i: res) {
            System.out.print(i + "  ");
        }
    }
}
