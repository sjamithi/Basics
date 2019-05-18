import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {
    private int[] original;
    private Random random;

    private ShuffleAnArray(int[] nums) {
        original = Arrays.copyOf(nums, nums.length);
        random = new Random(nums.length);
    }

    private int[] reset() {
        return original;
    }

    private int[] shuffle(int[] nums) {
        int[] shuffled = Arrays.copyOf(nums, nums.length);
        for (int i=0; i<nums.length; i++) {
            int x = random.nextInt(nums.length -i);
            int temp = shuffled[i];
            shuffled[i] = shuffled[x+i];
            shuffled[x+i] = temp;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
        System.out.println("shuffled array: ");
        int[] shu = shuffleAnArray.shuffle(nums);
        for (int i: shu) {
            System.out.println(i);
        }
        System.out.println("Original array: ");
        int[] res = shuffleAnArray.reset();
        for (int i: res) {
            System.out.println(i);
        }
    }
}
