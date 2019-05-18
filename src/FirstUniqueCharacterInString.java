import java.util.Scanner;

public class FirstUniqueCharacterInString {
    private static int unique(String s) {
        int[] chars = new int[26];
        int o = -1;
        for (int i=0; i<s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }

        for (int i=0; i<s.length(); i++) {
            if(chars[s.charAt(i) - 'a'] == 1) {
                o = i;
                break;
            }
        }
        return  o;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(unique(a));
    }
}
