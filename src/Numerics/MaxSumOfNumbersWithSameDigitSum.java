package Numerics;

import java.util.HashMap;
import java.util.Map;

public class MaxSumOfNumbersWithSameDigitSum {
    // find out a pair of numbers whose sum is max and also the sum of digits are same.

    private static int[] findMaxSum(int[] nums) {
        int j, max = -1000;
        int[] res = new int[2];
        for (int i=0; i< nums.length; i++) {
            j=i+1;
            if (j < nums.length) {
                int temp = nums[i] + nums[j];
                if (temp > max && areDigitsSumSame(nums[i], nums[j])) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                }
            }
        }
        return res;
    }

    private static boolean areDigitsSumSame(int n, int m) {
        return getDigitsSum(n) == getDigitsSum(m);
    }

    private static int findMax(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int prev, max = Integer.MIN_VALUE;
        for (int i: nums) {
            int sum = getDigitsSum(i);
            if (map.containsKey(sum)) {
                prev = map.get(sum);
                if (i + prev > max) {
                    max = i + prev;
                }
                map.put(sum, Math.max(i, prev));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }

    private static int getDigitsSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum < 10 ? sum : getDigitsSum(sum);
    }

    public static void main(String[] args) {
        int[] nums = {60, 42,33};
        int[] res = findMaxSum(nums);
        System.out.println(res[0] + ", " + res[1]);
        System.out.println(findMax(nums));
    }
}
