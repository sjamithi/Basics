package Arrays;

public class MonotonicArray {
    public static boolean isMonotonic(int[] A) {
        boolean inc = true, dec = true;
        for (int i = 0; i < A.length-1; i++) {
            int j=i+1;

            if (A[i] > A[j]) {
                inc = false;
            }

            if (A[i] < A[j]) {
                dec = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
//        int[] arr = {1,2,2,3};
//        int[] arr = {6,5,4,4};
        int[] arr = {1,2,4,5};
        System.out.println(isMonotonic(arr));
    }
}
