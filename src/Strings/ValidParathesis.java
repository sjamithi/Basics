package Strings;

import java.util.Stack;

public class ValidParathesis {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (stack.isEmpty() && (c == ')' || c == '}' || c == ']'))
                return false;
            else if (!stack.isEmpty() && isBalanced(stack.peek(), c))
                stack.pop();
            else stack.push(c);
        }
        return stack.isEmpty();
    }

    private static boolean isBalanced (char a, char b) {
        if (a == '(' && b == ')')
            return true;
        if (a == '[' && b == ']')
            return true;
        if (a == '{' && b== '}')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String input = "()[]({}";
        System.out.println(isValid(input));
    }
}
