import java.util.Stack;

public class RemoveOuterParanthesis {

    private static String removeOuterParanthesis(String str) {
        String res = "";
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if (str.charAt(0) == ']' || str.charAt(0) == '}' || str.charAt(0) == ')')
            return res;
       for (char a : str.toCharArray()) {
           if (!st.isEmpty() && isMatch(a, st.peek())) {
               sb.append(a);
               sb.append(st.pop());
           } else {
               st.push(a);
           }
       }
       res = sb.toString();
        return res;
    }

    private static boolean isMatch(char a, char b) {
        if (a == '[' && b == ']')
            return true;
        if (a == '{' && b == '}')
            return true;
        if (a == '(' && b == ')')
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "(()(()))";
        System.out.println(removeOuterParanthesis(s));
    }
}
