package Arrays;

public class MaximumProductSubArray {
    public static int maxProduct(int[] nums) {
        int temp = 1, max = Integer.MIN_VALUE;

        for (int n: nums) {
            if (temp * n <= 0) {
                temp = n;
            } else {
                temp = temp * n;
            }
            max = Math.max(temp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {-2,3,-4};
        System.out.println(maxProduct(nums));
    }
}
