package Arrays;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UniqueIntegersSumZero {
    // Find N Unique Integers Sum up to Zero, given n

    private static int[] sumZero(int n) {
     int[] arr = new int[n];

        for (int i = 0; i < n/2; i++) {
            int temp = n-i;
            arr[i] = temp;
            arr[n-i-1] = -temp;
        }

        if (n % 2 == 0) {
            return arr;
        }

       arr[n/2] = 0;

       return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] sol = sumZero(n);
        Arrays.stream(sol).forEach(i -> System.out.println(i));
    }
}
