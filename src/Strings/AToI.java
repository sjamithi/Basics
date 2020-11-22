package Strings;

public class AToI {
private static int atoi(String s) {
    if (s == null || s.length() == 0)
        return 0;

    int  num = 0, i= 0;
    boolean isNeg = false;

    if (s.charAt(0) == '-') {
        isNeg = true;
        i=1;
    }

    while (i < s.length()) {
        if (!Character.isDigit(s.charAt(i))) {
            i++;
        } else
        num = num * 10 + s.charAt(i++) - '0';
    }

    return isNeg ? -num : num;
}

    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(atoi(s));
    }
}
