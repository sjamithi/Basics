package Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingElementInSortedArray {
    public static int missingElement(int[] nums, int k) {
        int res = -1;
        List<Integer> actual = IntStream.range(nums[0], nums[nums.length-1]).boxed().collect(Collectors.toList());
        List<Integer> given = Arrays.stream(nums).boxed().collect(Collectors.toList());

        actual.removeAll(given);


        if (k <= actual.size()) {
            res = actual.get(k-1);
        } else {
//            for (int i = nums[nums.length-1]+1; i<= k - actual.size() + nums[nums.length-1]+1; i++) {
//                actual.add(i);
//            }
//            res = actual.get(k-1);
            return nums[nums.length-1] + k - actual.size();
        }

        return res;
    }

    private  static int optimizedMissingElement(int[] nums, int k) {
        int left = 0, right = nums.length-1;
        int missing = nums[right] - nums[left] - (right-left);

        if (missing < k) {
            return nums[right] -missing + k;
        }

        while (left+1 < right) {
            int mid = left + (right - left)/2;

            int leftMissing = nums[mid] - nums[left] - (mid - left);

            if (leftMissing >= k) {
                right = mid;
            } else {
                k = k- leftMissing;
                left = mid;
            }
        }
        return nums[left] + k;
    }

    public static void main(String[] args) {
        int[] A = {4,7,9,10}; int K = 3;
//        int[] A = {247645,695157,1735965,4220736,4322043,9465544,9543270,9900210};
//        int K = 10;
//        System.out.println(missingElement(A, K));
        System.out.println(optimizedMissingElement(A, K));
    }
}
