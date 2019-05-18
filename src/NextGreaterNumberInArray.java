import java.util.Stack;

public class NextGreaterNumberInArray {
    private static void nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int curr = 0, next;
        stack.push(arr[0]);

        for (int i=1; i<arr.length; i++) {
            if (!stack.isEmpty()) {
                curr = stack.pop();
            }
            next = arr[i];

            while(curr < next) {
                System.out.println(curr + "-->" + next);
                if (stack.isEmpty())
                    break;
                curr = stack.pop();
            }
            if (curr > next) {
                stack.push(curr);
            }
            stack.push(next);
        }

        while (!stack.isEmpty()) {
            stack.elementAt(stack.size()-1);
            curr = stack.pop();
            next = -1;
            System.out.println(curr +"-->"+ next);
        }

    }
    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        nextGreater(arr);
    }
}
