package Strings;

public class LexicographicallySmallestString {
    //Lexicographically smallest string formed by removing at most one character.

    private static String lexicographicalySmall(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length() - 1; i ++) {
            if (s.charAt(i) > s.charAt(i +1)) {
                return sb.deleteCharAt(i).toString();
            }
        }
//        return sb.deleteCharAt(sb.length()-1).toString();
        return sb.toString();
    }


    public static void main(String[] args) {
        String input = "abczd";
        System.out.println(lexicographicalySmall(input));
    }
}
