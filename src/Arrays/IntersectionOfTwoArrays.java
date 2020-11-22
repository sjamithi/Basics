package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    private static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> dups = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        for (int i: nums2) {
            dups.add(i);
        }

        for (int i: nums1) {
            if (dups.contains(i)) {
                res.add(i);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] arr  =intersection(nums1, nums2);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
