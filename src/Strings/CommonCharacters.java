package Strings;

class CommonCharacters {
    public static String commonChars(String s1, String s2) {
        StringBuilder sb= new StringBuilder();
        char [] chars = new char[26];
        char [] chars2 = new char[26];

        for (char c : s1.toCharArray()) {
            chars[c - 'a']++;
        }

        for (char c: s2.toCharArray()) {
                chars2[c- 'a']++;
        }

        for (int i=0; i< 26; i++) {
            if (chars[i] > 0 && chars2[i] > 0) {
                for (int j = 0; j<Math.min(chars[i], chars2[i]); j++) {
                    sb.append((char)(i +'a') );
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(commonChars("geeks", "forrgeeks"));
    }
}
