import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i=0, j, k=nums.length-1;
        while (i<nums.length -2) {
            if (nums[i] > 0)
                break;
                j = i + 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0)
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    if (sum <= 0) {
                        while (nums[j] == nums[++j] && j < k) {
                        }
                    } else if (sum >= 0) {
                        while (nums[k] == nums[--k] && j < k) {

                        }
                    }
                }
                while(nums[i] == nums[++i] && i< nums.length-2) {

                }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> result = threeSum(arr);
        for(List l : result) {
            System.out.println(l);
        }
    }
}
