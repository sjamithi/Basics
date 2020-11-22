package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfGivenSet {
    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return subsets;

        generate(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private static void generate(int[] nums, int index, List<Integer> curr, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(curr));

        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            generate(nums, i +1, curr, subsets);
            curr.remove(curr.size() -1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subsets(arr));
    }
}
