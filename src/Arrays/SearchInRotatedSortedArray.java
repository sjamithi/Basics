package Arrays;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;

        int i=0, j = nums.length-1, k = 0;

        while (i <= j) {
            int mid = i + (j-i)/2;

            if (target == nums[mid])
                return mid;
            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && nums[mid] > target) {
                    j = mid-1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (nums[mid] <= target && nums[j] > target) {
                    i = mid + 1;
                } else {
                    j = mid-1;
                }
            }
        }
return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }
}
