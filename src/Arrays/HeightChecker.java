package Arrays;

import java.util.Arrays;

public class HeightChecker {
    private static int heightChecker(int[] heights) {
      int res = 0;
      int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(arr);
        for (int i=0;i< arr.length; i++) {
            if (arr[i] != heights[i]) {
                res ++;
            }
        }

      return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,1,4,2,1,3};
        System.out.println(heightChecker(arr));
    }
}
