import java.util.Arrays;
import java.util.Stack;

class GiraffeHeight {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int j, k=0;
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i< A.length-1;) {
            j = i+1;
            if (A[i] < A[j]) {
                int [] newArr = Arrays.copyOfRange(A, j, A.length);
                count++;
                i++;
                solution(newArr);
            } else {
                while (A[i++] < A[j++]) {
                    k++;
                }
            }
        }
        return count + k;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,9,8,7,12,13,14};
//        int[] arr = {4,3,2,6,1};
        GiraffeHeight s = new GiraffeHeight();
        System.out.println(s.solution(arr));
    }
}