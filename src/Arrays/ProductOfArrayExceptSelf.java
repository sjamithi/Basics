package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        int[] b = new int[nums.length];
        int[] res = new int[nums.length];

        a[0] = b[nums.length-1] = 1;

        for (int i = 0; i< a.length-1; i++) {
            a[i+1] = a[i] * nums[i];
        }

        for (int i = b.length-1; i > 0; i--) {
            b[i-1] = b[i] * nums[i];
        }

        for (int i = 0; i< res.length; i++) {
            res[i] = a[i] * b[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] Input = {9,0,-2};
        int[] output = productExceptSelf(Input);

        Arrays.stream(output).forEach(i -> System.out.print(i + " "));
    }
}
