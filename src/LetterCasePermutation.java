import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LetterCasePermutation {

    public Set<String> permutations (String s) {

        Set<String> res = new HashSet<>();
        if (s == null || s.length() < 1) {
            return res;
        }
        for (char c: s.toCharArray()) {
            String temp = s;
            if (Character.isAlphabetic(c)) {
                char upperCaseC = Character.toUpperCase(c);
                char lowerCaseC = Character.toLowerCase(c);
                temp =  temp.replace(c, upperCaseC);
                res.add(temp);
                temp = temp.replace(c, lowerCaseC);
                res.add(temp);
            } else {
                continue;
            }
        }

        res.add(s.toUpperCase());
        res.add(s.toLowerCase());
        return res;
    }

    public static void main(String[] args) {
        String s = "Jw";
        LetterCasePermutation letterCasePermutation = new LetterCasePermutation();
        System.out.println(letterCasePermutation.permutations(s));
    }
}
