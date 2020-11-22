package Arrays;

import java.util.Arrays;

public class LexicographicallyNextPermutation {
    public static void nextPermutation(int[] nums) {
        int p = -1, q = -1;

        for (int i = nums.length-1; i>=0; i--) {
            if (nums[i-1] < nums[i]) {
                p = i-1;
                break;
            }
        }

        if (p == -1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        for (int i = nums.length-1; i>=0; i--) {
           if (nums[i] > nums[p]) {
               q = i;
               break;
           }
        }

        swap(nums, p , q);
        reverse(nums, p+1, nums.length-1);

        Arrays.stream(nums).forEach(i -> System.out.print(i + " "));
    }

    private static void swap(int[] arr, int p, int q) {
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }

    private static void reverse (int[] arr, int a, int b) {
        while (a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1};
        nextPermutation(arr);
    }
}
