package Strings;

import java.util.Stack;

public class MinRemoveToMakeValidParanthesis {

    private static String minRemove(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> remove = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            }

            if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    remove.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            remove.add(stack.pop());
        }

        for (int i = 0; i < s.length(); i++) {
            if (!remove.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        String s = "lee(t(c)o)de)";
//        String s = "a)b(c)d";
        String s = "))((";
        System.out.println(minRemove(s));
    }
}

