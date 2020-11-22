package Strings;

import java.util.Stack;

public class BalancedStringsCount {

    private static int balancedOptimizedCount(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int count = 0, res=0;

        for (char c: s.toCharArray()) {
            if (c == 'L' ) {
                count ++;
            } else  if (c == 'R') {
                count --;
            }

            if (count == 0)
                res++;
        }
        return res;
    }

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
        System.out.println(balancedOptimizedCount(s));
    }
}
