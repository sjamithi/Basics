import java.util.*;

public class RoughWork {

    static Map<Integer, List<String>> map = new HashMap<>();
    private static boolean contains(List<String> list, String s) {
        return contains(new HashSet<>(list), s, 0, new boolean[s.length()]);
    }

    private static boolean contains(HashSet<String> dict, String s, int start, boolean[] mem) {
        if(start == s.length())
            return true;
        if (mem[start])
            return mem[start];

        for(int end = start+1; end <= s.length(); end++) {
            if(dict.contains(s.substring(start, end)) && contains(dict, s, end, mem))
                return mem[start] = true;
        }

        return mem[start] = false;
    }

    private static List<String> listOfWords(List<String> dict, String s) {
        return listOfWords(new HashSet(dict), s, 0);
    }

    private static List<String> listOfWords(Set<String> set, String s, int start) {
        List<String> res = new ArrayList<>();
        if (start == s.length())
            res.add("");
        if (map.containsKey(start))
            return map.get(start);

        for (int end = start+1; end <= s.length(); end++) {
            if (set.contains(s.substring(start, end))) {
                List<String> list = listOfWords(set, s, end);
                for (String l: list) {
                    res.add(s.substring(start, end) + (l.equalsIgnoreCase("") ? "" : " ")+ l);
                }
            }
        }
        map.put(start, res);

        return res;
    }


    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> dict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        System.out.println(contains(dict, s));
        System.out.println(listOfWords(dict, s));
    }
}
