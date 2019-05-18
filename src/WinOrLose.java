public class WinOrLose {
    private static boolean canWin(int[] arr) {
        int stepSize =0, sum=0, i=0;
        boolean[] used = new boolean[arr.length];
        while(i<arr.length) {
            stepSize = arr[i];
            sum += stepSize;
            if (!used[i]) {
                used[i] = true;
            } else
                return false;
            if (sum > arr.length + 1 || sum < 0)
                return false;
            else if (sum <= arr.length)
                i = i+stepSize;
            if (i == arr.length)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,1, 2};
        System.out.println(canWin(arr));
    }
}
