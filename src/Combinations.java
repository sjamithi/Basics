public class Combinations {
    private final String in;
    private StringBuilder out = new StringBuilder();
    private Combinations(String str) {
        in = str;
    }

    private void combine() {
        combine(0);
    };

    private void combine(int start) {
        for (int i = start; i < in.length(); i++) {
            out.append(in.charAt(i));
            System.out.println(out);
            if (i < in.length())
                combine(i + 1);
            out.setLength(out.length() - 1);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        Combinations combinations = new Combinations(str);
        combinations.combine();
    }
}
