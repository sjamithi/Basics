public class ShortestWordDistance {
    private static int shortestDistance(String[] words, String word1, String word2) {
        int min = words.length;
        int i1 = -1, i2=-1;
        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
            } else if (words[i].equals(word2)) {
                i2 = i;
            }
            if (i1 != -1 && i2 != -1)
            min = Math.min(min, (Math.abs(i1 - i2)));
        }
        return min;
    }
    public static void main(String[] args) {
//        String[] strs = {"practice", "makes", "perfect", "coding", "makes"};
//        String word1 = "coding", word2 = "makes";

        String[] strs = {"a","a","b","b"};
        String word1 = "a", word2 = "b";
        System.out.println(shortestDistance(strs, word1, word2));
    }
}
