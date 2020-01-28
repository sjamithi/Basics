package Arrays;

public class FindMinimumInRotatedSortedArray {
    private static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        int start = 0, end = nums.length-1;
        while (start < end) {
            int mid = start + (end - start) /2;
            if (nums[start] < nums[mid]) {
                start = mid + 1;
            } else if (nums[start] > nums[mid]) {
                end = mid;
            }
        }

        return nums[start];
    }
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
