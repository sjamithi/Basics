package Arrays;

public class MaximumSubArray {
    private static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;

        for (int num : nums) {
            if (sum < 0)
                sum = num;
            else
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
