public class MoveZeros {
    private void moveZeroes(int[] nums) {
        int j=0;

        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        for ( ; j< nums.length; j++) {
            nums[j] = 0;
        }
        for (int a: nums) {
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.moveZeroes(arr);
    }
}
