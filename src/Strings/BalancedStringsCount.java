package Strings;

import java.util.Stack;

public class BalancedStringsCount {

    private static int balancedStringsCount(String s) {
        int count = 0;
        if (null == s || s.length() == 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {

            if (!stack.isEmpty() && c != stack.peek()) {
                stack.pop();
                if (stack.isEmpty()) {
                    count++;
                }
            } else {
                stack.push(c);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringsCount(s));
    }
}
