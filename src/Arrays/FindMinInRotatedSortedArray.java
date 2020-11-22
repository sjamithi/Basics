package Arrays;

public class FindMinInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int i = 0, j = nums.length-1;

        while (i <= j) {
            int mid = i + (j-i)/2;

            if (mid > 0 && nums[mid] < nums[mid -1])
                return nums[mid];
            else if (nums[mid] >= nums[i] && nums[j] < nums[mid]) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return nums[i];
    }
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}
