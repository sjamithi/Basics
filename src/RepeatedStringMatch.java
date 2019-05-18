public class RepeatedStringMatch {
    private static int match(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        sb.append(a);
        while (sb.indexOf(b) < 0) {
            if (sb.length()-a.length() > b.length())
                return -1;
            sb.append(a);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "abcd";
        String B = "cdabcdab";
        System.out.println(match(A, B));
    }
}
