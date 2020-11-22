package GreedyAlgorithm;

import java.util.Arrays;

public class WidestPathWithoutTrees {

    private static int widestPath(int[] x , int[] y) {
        Arrays.sort(x);
        int j, wide = -1;
        for (int i = 0; i < x.length; i++) {
            j = i+1;

            if (j < x.length) {
                wide = Math.max(wide, (x[j] - x[i]));
            }
        }
        return wide;
    }


    public static void main(String[] args) {
        int[] x = {4,1,5,4}, y = {3,4,5,1,3,7};
        System.out.println(widestPath(x, y));
    }
}
