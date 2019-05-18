class Solution {
    static int solution(int[] A) {
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }

            r = Math.max(r, count);
        }
        return r +  result > r ? (r + result) : r;
    }

    public static void main(String[] args) {
        int[] A = {1,1,0,1,1,0};
        System.out.println(solution(A));
    }
}