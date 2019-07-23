import java.util.*;

public class PatternFindAndReplace {
    private static String stringPattern(String pattern) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder res = new StringBuilder();
        int i=1;
        for (char c: pattern.toCharArray()) {
            map.put(c, map.getOrDefault(c, i++));
            res.append(map.get(c));
        }
        return res.toString();
    }

    private static List<String> findAndReplacePattern(String[] words, String pattern) {
        String reg = stringPattern(pattern);
        List<String> res = new ArrayList<>();

        for (String word: words) {
            String check = stringPattern(word);
            if (reg.equals(check)) {
                res.add(word);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> res= findAndReplacePattern(words, pattern);
        res.forEach(System.out::println);
    }
}
