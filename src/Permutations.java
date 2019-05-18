import java.util.ArrayList;
import java.util.List;

public class Permutations {
    private StringBuilder out = new StringBuilder();
    private boolean[] used;
    private final String in;

    private Permutations() {
        in = "213";
        used = new boolean[in.length()];
    }

    private Permutations(final String str) {
        in = str;
        used = new boolean[in.length()];
    }

    private void permute() {
        if (in.length() == out.length()) {
            System.out.println(out);
            return;
        }

        for (int i=0; i < in.length(); i++) {
            if (used[i])
                continue;
             used[i] = true;
             out.append(in.charAt(i));
             permute();
             used[i] = false;
             out.setLength(out.length() -1);
        }
    }

    private List<String> permutations(String s) {
        if (s == null)
            return null;
        List<String> permutations = new ArrayList<>();
        if (s.length() == 0) {
            permutations.add("");
            return permutations;
        }
        char first = s.charAt(0);
        String remainder = s.substring(1);
        List<String> words = permutations(remainder);

        for (String word: words) {
            for (int i=0; i<=s.length(); i++) {
                String res = insertAt(word, first, i);
                permutations.add(res);
            }
        }

        return null;
    }

    private String insertAt(String word, char c, int i) {
        String start = word.substring(0, i);
        String end = word.substring(i);
        return start + c + end;
    }

    public static void main(String[] args) {
        String in = "abcd";
//        Permutations permutations = new Permutations(in);
        Permutations permutations = new Permutations();
        permutations.permute();
//        System.out.println(permutations.permutations(in));
    }
}
