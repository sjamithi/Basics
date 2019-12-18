package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            } else {
              set.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
