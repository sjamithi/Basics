package Strings;

public class RevserStringInPlace {
    private static String reverse(String s) {
        if (s== null | s.length() == 0)
            return s;
        int i=0, j=s.length()-1;
        char[] arr = s.toCharArray();

        while (i < j) {
            char temp = s.charAt(i);
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverse(s));
    }
}
