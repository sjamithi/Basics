import java.util.PriorityQueue;
import java.util.Queue;

public class LicenseKeyFormatting {
    private static String format(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int j=0;

        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) != '-') {
                sb.append(s.charAt(i));
                j++;
                if (j == k && i!=0) {
                    sb.append("-");
                    j=0;
                }
            }
        }
        return sb.reverse().toString().toUpperCase();
    }
    public static void main(String[] args) {
        String S = "--a-a-a-a--";
        int k=2;
        System.out.println(format(S, k));

    }
}
