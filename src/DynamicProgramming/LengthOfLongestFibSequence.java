package DynamicProgramming;

import java.util.*;

public class LengthOfLongestFibSequence {
    private static int lenLongestFibSubseq(int[] A) {
        int max = 0;
        Set<Integer> res = new HashSet<>();
        for (int i: A) {
            res.add(i);
        }
        if (A.length < 3)
            return 0;
        for (int i=0; i< A.length- 1; i++) {
            for (int j=i+1; j < A.length; j++) {
                int a = A[i];
                int b = A[j];
                int c = a + b;
                int count = 2;
                while (res.contains(c)) {
                    count ++;
                    max = Math.max(max, count);
                    a = b;
                    b = c;
                    c = a + b;
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,7,8,9,10,14,15,18,23,32,50};
        System.out.println(lenLongestFibSubseq(arr));
    }
}
