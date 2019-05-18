import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupsIntArray {
    private void removeDup(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int anArr : arr) {
            if (!set.contains(anArr))
                set.add(anArr);
        }
        for(int i: set) {
            System.out.println(i);
        }
    }

    private int removeDupsFromSortedArray(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    private static int[] inPlaceDupsRemoval(int [] nums) {
        if (nums.length == 0) return null;
        Arrays.sort(nums);
        int i=0, j =0, k = 0;
        while (i< nums.length) {
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            nums[k] = nums[i];
            i = j;
            k++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2, 3, 3, 3};
        RemoveDupsIntArray r = new RemoveDupsIntArray();
//        r.removeDup(arr);
        int res = r.removeDupsFromSortedArray(arr);
            System.out.println(res);
        int[] dupsRemoval = inPlaceDupsRemoval(arr);
        for (int i: dupsRemoval) {
            System.out.print(i + " ");
        }

    }
}
