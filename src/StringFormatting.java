import java.util.ArrayList;
import java.util.List;

public class StringFormatting {
    private static String stringFormatting (String s, int k) {
        List<String> list = new ArrayList<>();
        StringBuilder[] strings = new StringBuilder[k];
        for (int i=0; i<k; i++) {
            strings[i] = new StringBuilder();
        }
        int count =0;
        int i=0;
        while (i<s.length()) {
            for (int j=0; i<s.length()&& j<k; j++) {
                strings[j].append(s.charAt(i++));
            }
            for (int j=k-2; j>=1 && i<s.length(); j--) {
                strings[j].append(s.charAt(i++));
            }
        }
        for (int in = 1; in<k; in++) {
            strings[0].append(strings[in]);
        }

        return strings[0].toString();
}

    public static void main(String[] args) {
        String s = "ABCDEFGHIJ";
        int k=3;
        System.out.println(stringFormatting(s, k));
    }
}
