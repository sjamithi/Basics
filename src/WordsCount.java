import java.util.LinkedList;
import java.util.List;

class WordsCount {

    public static List<String> commonChars(String[] A) {
        List<String> res = new LinkedList<>();
        char[] chars = new char[26];

        for (String s: A) {
            for (char c: s.toCharArray()) {
                chars[c - 'a'] ++;
            }
        }

        for (int i = 0; i< 26; i++) {
            if (chars[i] >= 3) {
                for (int j = 0; j < chars[i]/3; j++) {
                    res.add(""+(char)(i + 'a'));
                }
            }
        }

        return res;
    }


    public static void main (String[] args) {
        System.out.println(commonChars(new String[] {"bella","label","roller"}));
    }

}
