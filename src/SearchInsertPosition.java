public class SearchInsertPosition {
    private int searchInsert(int[] nums, int target) {
     int min = 0, max = nums.length -1;

     while(min <= max) {
         int mid = (min + max)/2;
         if (nums[mid] == target)
             return mid;
         else if(nums[mid] > target)
             max = mid -1;
         else
             min = mid +1;
     }
     return min;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        SearchInsertPosition s = new SearchInsertPosition();
        System.out.println(s.searchInsert(arr, 0));
    }
}
