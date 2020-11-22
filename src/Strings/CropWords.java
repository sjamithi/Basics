package Strings;

public class CropWords {

    //Crop characters, shouldn't end with space or incomplete word, return string shouldn't be greater than k
    private static String cropWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        if (s.length() <= n) {
            return s;
        }
        int spaceIndex = 0;
        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex = i;
            }

            if (i == n) {
                return sb.substring(0, spaceIndex);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String s = " co de my ";
        int k = 5;
        System.out.println(cropWords(s, k));
    }
}
