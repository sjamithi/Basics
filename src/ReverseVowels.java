public class ReverseVowels {
    private static String rev(String s) {
        String rev = "", vowels = "aeiou";
        int i=0, j=s.length()-1;

        while (i<s.length()/2 && j >s.length()/2) {
            if (vowels.indexOf(s.charAt(i)) != -1 && vowels.indexOf(s.charAt(j)) != -1 ) {
                swap(s.charAt(i), s.charAt(j));
            }
        }
        return  rev;
    }

    private static void swap(char a, char b) {
        char temp = ' ';
        temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(rev(s));
    }
}
