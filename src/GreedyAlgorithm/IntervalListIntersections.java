package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntervalListIntersections {
    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;
        List<int[]> res = new LinkedList<>();

        while (i < A.length && j < B.length) {
            int low = Math.max(A[i][0], B[j][0]);
            int high = Math.min(A[i][1], B[j][1]);

            if (low <= high) {
                res.add(new int[]{low, high});
            }

            if (A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
    public static void main(String[] args) {
       int[][] A = {{0,2},{5,10},{13,23},{24,25}}, B = {{1,5},{8,12},{15,24},{25,26}};
       int c[][] = intervalIntersection(A, B);
       for (int i = 0; i< c.length; i++) {
           for (int j = 0; j< c[0].length; j++) {
               System.out.print(c[i][j] + " ");
           }
           System.out.println();
       }
    }
}
