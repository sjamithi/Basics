import java.util.Arrays;

public class MaxProduct {
    private static int maxProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        for (int i: nums) {
            if (i <= min1) {
                min2 = min1;
                min1 = i;
            } else if(i <= min2) {
                min2 = i;
            }

            if (i >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i >= max2) {
                max3 = max2;
                max2 = i;
            } else {
                max3 = i;
            }
        }
        return Math.max(max1 * min1 * min2, max1 * max2 * max3);
    }

    private static int usingSort(int[] nums) {
         Arrays.sort(nums);
         if (nums[0] >= 0) {
         return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];
         } else {
             return nums[0] * nums[1] * nums[nums.length-1];
         }
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,4};
        System.out.println(maxProduct(nums));
        System.out.println(usingSort(nums));
    }
}
