public class SingleNonDuplicate {
    public int getDup(int[] nums) {
        int start = 0, end = nums.length-1;
        while (start < end) {
            int mid = (start + end)/2;
            if(mid%2 == 1)
                mid--;
            if(nums[mid] != nums[mid + 1])
                end = mid;
            else
                start = mid + 2;
        }
        return nums[start];
    }

    public int single(int[] arr) {
        int x = arr[0];
        for (int i=1; i< arr.length; i++) {
            x = x ^ arr[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,1,2,2,3,4,4};
        SingleNonDuplicate snd = new SingleNonDuplicate();
        System.out.println(snd.getDup(arr));
        System.out.println(snd.single(arr));
    }
}
