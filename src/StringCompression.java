import java.util.Arrays;

public class StringCompression {
    private static int compress(char[] chars) {
        char last = chars[0];
        int count=1;
        String str = "";
        for (int i=1; i<chars.length; i++) {
            if (chars[i] == last) {
                count++;
            } else {
                str += last + "" + count;
                last = chars[i];
                count=1;
            }
        }
        str += last + "" + count;
        System.out.println(str);
        return str.length();
    }

    private static int compressionInPlace(char[] chars) {
        int start = 0, end = 0, store = 0;
        while (end < chars.length) {
            while (end < chars.length && chars[end] == chars[start]) {
                end ++;
            }

            int len = end - start;
            chars[store++] = chars[start];
            if (len > 1) {
                char[] charsLen = String.valueOf(len).toCharArray();
                for (char c: charsLen) {
                    chars[store++] = c;
                }
            }
            start=end;
        }
        System.out.println(Arrays.toString(chars));
        return store;
    }

    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(compress(chars));
        System.out.println(compressionInPlace(chars));
    }
}
