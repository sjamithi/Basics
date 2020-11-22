package Arrays;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
       int[] max = new int[nums.length];
       int[] min = new int[nums.length];
       int result = min[0] = max[0] = nums[0];

       for (int i = 1; i < nums.length; i++) {
           if (nums[i] > 0) {
               max[i] = Math.max(nums[i], max[i-1] * nums[i]);
               min[i] = Math.min(nums[i], min[i-1] * nums[i]);
            } else {
               max[i] = Math.max(nums[i], min[i-1] * nums[i]);
               min[i] = Math.min(nums[i], max[i-1] * nums[i]);
           }
           result = max[i] > result ? max[i] : result;
       }

       return result;
    }

    public static void main(String[] args) {
//        int[] nums = new int[] {-2,3,-4};
        int[] nums = new int[] {-4, -3};
//        int[] nums = new int[] {2,3,-2, 4};
//        int[] nums = new int[] {-2, 0, -1};
//        int[] nums = new int[] {0, 2};
        System.out.println(maxProduct(nums));
    }
}
