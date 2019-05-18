public class LongestCommonPrefix {
    private static String lcp(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String s: strs) {
            min = Math.min(min, s.length());
        }

        int l = 0, h = min;
        while (l <= h) {
            int mid = (l + h)/2;
            if (isPrefix(strs, mid))
                l = mid + 1;
            else
                h = mid - 1;
        }

        return strs[0].substring(0, (l+h)/2);
    }

    private static boolean isPrefix(String[] strs, int len) {
        String str = strs[0].substring(0, len);
        for (int i=1; i<strs.length; i++) {
            if (!strs[i].startsWith(str))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] strs = {"abc", "abd", "abcd", "abcde"};
        System.out.println(lcp(strs));
    }
}
