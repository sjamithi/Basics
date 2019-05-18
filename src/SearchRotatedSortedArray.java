public class SearchRotatedSortedArray {
    private static int search(int[] arr, int target) {
        if (arr == null || arr.length == 0)
            return -1;

        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (arr[mid] == target)
                return mid;

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target< arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            } else {
                if (arr[mid] < target && target <= arr[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
    return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println("The target is present in the index " + search(arr, 4));
    }
}
