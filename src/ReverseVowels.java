import java.util.Stack;

public class ReverseVowels {
    private static String rev(String s) {
        String rev = "", vowels = "aeiou";
        int i=0, j=s.length()-1;

        while (i<j && i<s.length() && j>=0) {
            if (vowels.indexOf(s.charAt(i)) != -1 && vowels.indexOf(s.charAt(j)) != -1 ) {
                rev = swap(s.toCharArray(),i, j);
            }
            i++;j--;
        }
        return  rev;
    }

    private static String swap(char[] arr, int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        Stack st = new Stack<>();
        st.peek();


        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "hellol";
        System.out.println(rev(s));
    }
}
