package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementII {
    public static int[] nextGreater(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);

        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: temp) {
            while (!stack.isEmpty() && stack.peek() < i) {
                map.put(stack.pop(), i);
            }
            stack.push(i);
        }

        int k = 0;
        for (int i: nums) {
            temp[k++] = map.getOrDefault(i, -1);
        }

        return temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] res = nextGreater(arr);
        Arrays.stream(res).forEach(i -> System.out.print(i + " "));
    }
}
