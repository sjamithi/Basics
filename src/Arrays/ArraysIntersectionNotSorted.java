package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysIntersectionNotSorted {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j=0;
        List<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while ( i< nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return res.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] arr = intersect(nums1, nums2);
        for(int i: arr) {
            System.out.println(i);
        }
    }
}
