public class MinInRotatedSortedArray {
    private static int min(int[] arr) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];
        int start = 0, end = arr.length -1;

        while(start < end) {
            int mid = (start + end)/2;

            if (arr[mid] < arr[mid-1])
                return arr[mid];
            else if(mid > 0 && arr[mid] >= arr[start] && arr[mid] > arr[end])
                start = mid +1;
            else
                end = mid-1;
        }

        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 3, 1, 2};
        System.out.println(min(arr));
    }
}
