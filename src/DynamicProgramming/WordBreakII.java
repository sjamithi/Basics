package DynamicProgramming;

import java.util.*;

public class WordBreakII {

    private static List<String> possibleSentences(List<String> dict, String s) {
        return possibleSentences(new HashSet(dict), s, 0);
    }

    private static List<String> possibleSentences(Set<String> dict, String s, int start) {
        List<String> res = new ArrayList<>();
        if (start == s.length())
            res.add("");

        for (int end=start +1; end <= s.length(); end++) {
            if (dict.contains(s.substring(start, end))) {
                List<String> list = possibleSentences(dict, s, end);

                for (String l : list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        return res;
    }

    private static List<String> memoization(List<String> dict, String s) {
        return memoization(new HashSet(dict), s, 0);
    }

    private static List<String> memoization(Set<String> dict, String s, int start) {
        LinkedList<String> res = new LinkedList<>();
        Map<Integer, List<String>> map = new HashMap<>();

        if (map.containsKey(start)) {
            return map.get(start);
        }
        if (start == s.length()) {
            res.add("");
        }

        for (int end=start+1; end<=s.length(); end++) {
            if (dict.contains(s.substring(start,end))) {
                List<String> list = memoization(dict, s, end);
                for (String l :list) {
                    res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l);
                }
            }
        }
        map.put(start, res);
        return res;
    }

    public static void main(String[] args) {
       String s = "catsanddog";
        List<String> dict = Arrays.asList("cat", "cats", "and", "sand", "dog");
//       List<String> res = possibleSentences(dict, s);
//        for (String r: res) {
//            System.out.println(r);
//        }

        List<String> memo = memoization(dict, s);
        for (String r: memo) {
            System.out.println(r);
        }


    }
}
