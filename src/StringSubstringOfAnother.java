public class StringSubstringOfAnother {
    private static boolean isSubSequence(String s1, String s2) {
        int j=0;
        for (int i=0; i<s2.length()&& j<s1.length(); i++) {
            if (s1.charAt(j) == s2.charAt(i))
                j++;
        }
        return j==s1.length();
    }
    public static void main(String[] args) {
        String str1 = "gksrekd";
        String str2 = "geeksforgeeks";
        boolean res = isSubSequence(str1, str2);
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    }
