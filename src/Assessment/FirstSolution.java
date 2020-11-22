package Assessment;

import java.util.HashMap;
import java.util.Map;

public class FirstSolution {


   private static int solution(int[] A) {
       int N = A.length;
       int result = 0;
       for (int i = 0; i < N; i++)
           for (int j = 0; j < N; j++)
               if (A[i] == A[j])
                   result = Math.max(result, Math.abs(i - j));
       return result;
   }

   private static int optimized (int[] A) {

       if (A == null || A.length == 0) {
           return 0;
       }

       int N = A.length;

       int result = 0;
       Map<Integer, Integer> map = new HashMap<>();

       for (int i = 0; i< N; i++) {
           if (map.containsKey(A[i])) {
               result = Math.max(result, i - map.get(A[i]));
           } else {
               map.put(A[i], i);
           }
       }
       return result;
   }

    public static void main(String[] args) {
        //Complexity of the program is

        int[] A = {4,6,2,2,6,6,1};

        System.out.println(solution(A));
        System.out.println(optimized(A));
    }
}
