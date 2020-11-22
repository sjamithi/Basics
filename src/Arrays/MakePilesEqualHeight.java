package Arrays;

import java.util.Arrays;

public class MakePilesEqualHeight {
    //Min Steps to Make Piles Equal Height
    private static int minPiles(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

//        Arrays.stream(arr).forEach(i -> System.out.println(i));

       int l = 0, r = arr.length-1;
      while (l < r) {
          if (arr[r] != arr[r-1]) {
              normalize(arr, r-1, r);
              count++;
          }
          r--;
      }
        Arrays.stream(arr).forEach(i -> System.out.println(i));
        return count;
    }

    private static void normalize(int[] arr, int l, int r) {
        arr[r] =  arr[l];
    }

    public static void main(String[] args) {
        int[] piles = {5, 2, 1};
        System.out.println(minPiles(piles));
    }
}
