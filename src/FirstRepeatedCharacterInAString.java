import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacterInAString {
    private static char repeated(String s) {
        Set<Character> set = new HashSet<>();

        for (char c: s.toCharArray()) {
            if (set.contains(c))
                return c;
            else
                set.add(c);
        }
        return ' ';
    }

    private static char findFirst(String s) {
        char res = 0;
        int[] chars = new int[256];
        for (char c: s.toCharArray()) {
            chars[c]++;
        }
        for (int i=0; i<s.length();i++) {
            if (chars[s.charAt(i)] == 1) {
                res = s.charAt(i);
                break;
            }
        }
        return res;
    }

    private static String repeatedWord(String str) {
        Set<String> set = new HashSet<>();
        String[] arr = str.split("\\s+");
        for(String s : arr) {
            if (set.contains(s))
                return s;
            else
                set.add(s);
        }
        return "";
    }

    public static void main(String[] args) {
        String s = "sandeep";
        System.out.println(repeated(s));
        System.out.println(findFirst(s));
        System.out.println(repeatedWord(s));
    }
}

