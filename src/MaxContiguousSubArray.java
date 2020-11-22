public class MaxContiguousSubArray {
    private int maxSubArray(int[] arr) {

        int sum = 0, max = Integer.MIN_VALUE;

       for (int i: arr) {
           if (sum < 0)
               sum = i;
           else
               sum += i;
           max = sum > max ? sum : max;
       }
        return max;

       /* int i =0, j=0, sum=arr[0], max = arr[0], n=arr.length;
        while(i<n-1 && j<n) {
            if (sum + arr[i+1] > max) {
                sum += arr[i+1];
                max = sum;
                i++;
            } else {
                j ++;
                i = j;
                sum = arr[j];
            }
        }
        return max;*/
    }

    private int maxSum (int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i: arr) {
            sum += i;

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
    int[] arr = {-2,-1,-5,-1,-4};
    MaxContiguousSubArray max = new MaxContiguousSubArray();
    System.out.println(max.maxSubArray(arr));
        System.out.println(max.maxSum(arr));
    }
}
