public class CountAndSay {
    private static String countAndSay(int n) {
       if (n <= 0)
           return "-1";
       String result = "1";
       for (int i=1; i<n ; i++) {
           result = build(result);
           System.out.println(result);
       }
       return result;
    }

    private static String build(String str) {
    StringBuilder sb = new StringBuilder();
    int n=0;
    while (n < str.length()) {
        char prev = str.charAt(n);
        int count = 0;
        while( n < str.length() && prev == str.charAt(n)) {
            count++;
            n++;
        }
        sb.append(String.valueOf(count));
        sb.append(prev);
    }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 5;
        countAndSay(n);
    }
}
