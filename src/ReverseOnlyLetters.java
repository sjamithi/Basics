public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        int i=0, j = S.length()-1;
        char[] str = S.toCharArray();
        while (i<j && i < S.length() && j >=0) {
            if(Character.isAlphabetic(str[i]) && Character.isAlphabetic(str[j])) {
                str = reverseChar(str, i, j);
                i++; j--;
            } else if (Character.isAlphabetic(str[i]) && !Character.isAlphabetic(str[j])) {
                j--;
            } else if (!Character.isAlphabetic(str[i]) && Character.isAlphabetic(str[j])) {
                i++;
            } else {
                i++;j--;
            }
        }
        return new String(str);
    }

    private static char[] reverseChar(char[] arr ,int a, int b) {
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static void main(String[] args) {
        String s ="a*b-cdef";
        s = reverseOnlyLetters(s);
        System.out.println(s);
    }
}

