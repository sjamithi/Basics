package Numerics;

import java.util.HashMap;
import java.util.Map;

public class FractionsSumsToOne {
    // Number of fractions that sum up to 1

    private static int numOfFractions(int[] x, int[] y) {
        Map<Double, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < x.length; i++) {
           for (int j = i+1; j < x.length; j ++) {
               int num = (x[i] * y[j] + x[j] * y[i]);
               int den = (y[i] * y[j]);
               if (num == den) {
                   count++;
               }
           }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] X = {1,1,1}, Y = {2,2,2};
        System.out.println(numOfFractions(X, Y));
    }
}
