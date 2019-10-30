package Strings;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (null == word || word.length() == 0) {
            return true;
        }
        if (word.toUpperCase().equals(word)) {
            return true;
        }

        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        } else if (word.equals(word.toLowerCase())) {
            return true;
        }
        return false;
    }

    private boolean checkCapital(String word) {
        int index = -1, count = 0;
        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                index = i;
                count++;
            }
        }
            if (count == 0 || count == word.length() || ((count == 1 && index == 0) )) {
                return true;
            }
            return false;
        }

    public static void main(String[] args) {
        String input = "flaG";
        DetectCapital detectCapital = new DetectCapital();
        System.out.println(detectCapital.detectCapitalUse(input));
        System.out.println(detectCapital.checkCapital(input));
    }
}
