import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestSibling {
    private static StringBuilder out = new StringBuilder();
    private static boolean[] used;
    private static String in;
    private static List<String> list = new ArrayList<>();

    private LargestSibling() {
        this("123");
    }

    private LargestSibling(final String str) {
        in = str;
        used = new boolean[in.length()];
    }

    private static void permute() {
        if (in.length() == out.length()) {
            list.add(out.toString());
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

    public static int largest() {
        List<Integer> l = list.stream().map(Integer::valueOf).collect(Collectors.toList());
        return l.stream().mapToInt(v -> v).max().getAsInt();
    }

    public int solution(int N) {
        // write your code in Java SE 8
        StringBuilder sb = new StringBuilder(String.valueOf(N));
        Arrays.sort(sb.toString().toCharArray()) ;
        return Integer.valueOf(sb.reverse().toString());
//        return largest();
    }

    public static void main(String[] args) {
        int n = 213;
        LargestSibling ls = new LargestSibling();
        ls.permute();
//        ls.solution(n);
        System.out.println("largest is : "+ ls.solution(n));
    }
}
