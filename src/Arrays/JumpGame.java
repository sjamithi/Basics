package Arrays;

public class JumpGame {

    // You are given an array of non-negative integers arr and a start index. When you are at an index i,
    // you can move left or right by arr[i]. Your task is to figure out if you can reach value 0.

    private static boolean didReachZero(int[] arr, int n) {
       boolean[] visited = new boolean[arr.length];
       return didReach(arr, n, visited);
    }

    private static boolean didReach(int[] arr, int n, boolean[] visited) {
      if (arr[n] == 0)
          return true;

      if (!visited[n]) {
          visited[n] = true;

          if (n - arr[n] >=0 && didReach(arr, n- arr[n], visited))
              return true;
          if (n + arr[n] < arr.length && didReach(arr, n+ arr[n], visited))
              return true;
      }

      return false;

    }

    public static void main(String[] args) {
       int[] arr = {3, 4, 2, 3, 0, 3, 1, 2, 1};
       int start = 7;
        System.out.println(didReachZero(arr, start));
    }
}
