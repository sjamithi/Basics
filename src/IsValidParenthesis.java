import java.util.Scanner;
import java.util.Stack;

public class IsValidParenthesis {

    private boolean isValid(String s) {
        if (s == null)
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i= 0; i<s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.isEmpty() && (c == ')' || c == ']' || c == '}'))
                return false;
            if (!stack.isEmpty() && isBalanced(stack.peek(), c))
                stack.pop();
            else
                stack.push(c);
        }
        return stack.isEmpty();
    }

    private boolean isBalanced(char a, char b) {
        if (a == '(' && b ==')') {
            return true;
        }
        if (a == '[' && b ==']') {
            return true;
        }
        if (a == '{' && b =='}') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        IsValidParenthesis isValidParenthesis  = new IsValidParenthesis();
        System.out.println(isValidParenthesis.isValid(s));
    }
}
