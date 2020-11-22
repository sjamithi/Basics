package Assessment;

import java.util.HashMap;
import java.util.Map;

public class ThirdSolution {


    private static int solution(int[] A) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< A.length; i++) {
            int digitsSum = sumOfDigits(A[i]);
            if (map.containsKey(digitsSum)) {
                int prev = map.get(digitsSum);
                result = Math.max(result, prev + A[i]);
            } else {
                map.put(digitsSum, A[i]);
            }
        }

        return result;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] A = {42, 33, 60};
        System.out.println(solution(A));

        //Complexity of the program is
    }
}
