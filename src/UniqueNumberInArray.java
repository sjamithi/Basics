public class UniqueNumberInArray {
    private static int unique(int[] arr) {
        int temp = arr[0];
        for (int i=1; i< arr.length;i++) {
            temp = temp ^ arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,1,5,6,4, 5};
        System.out.println(unique(arr));
    }
}
