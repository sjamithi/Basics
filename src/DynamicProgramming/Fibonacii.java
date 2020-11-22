package DynamicProgramming;

import java.util.Arrays;

public class Fibonacii {
    public static int fib(int N) {
        int[] arr = new int[N+1];
        arr[0] = 0;
        arr[1] = 1;
        int sum = 0;
        for (int i=2; i< N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        return arr[N-1] + arr[N-2] ;
    }

    public static void main(String[] args) {
        System.out.println(fib(23));
    }
}
