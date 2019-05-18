import java.util.*;

public class FirstWordThatAppearedOnce {
    private static String findFirst(List<String> list) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s: list) {
            map.put(s, map.getOrDefault(s,0)+1);
        }

        for (String s: map.keySet())
            if (map.get(s) == 1)
                return s;
        return "-1";
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hi", "i", "am", "sandeep", "i", "hi", "sandeep");
        System.out.println(findFirst(list));
    }
}
