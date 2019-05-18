import java.util.*;

public class Codec {

    private Map<Integer, String> map = new HashMap<>();
    private StringBuilder sb = new StringBuilder();
    // Encodes a list of strings to a single string.
    private String encode(List<String> strs) {
        if (strs.size() == 0) {
            return "";
        }
        int i=1;
        for(String s: strs) {
            map.put(i++, s);
        }

        for(Integer n: map.keySet()) {
            sb.append(String.valueOf(n));
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    private List<String> decode(String s) {
        if (s.equalsIgnoreCase("")) {
            return Collections.singletonList("");
        } else if(s.equals(null)) {
            return new ArrayList<>();
        }


        List<String> deco = new ArrayList<>();
        for(char c: s.toCharArray()) {
            deco.add(map.get(c - 'a'));
        }
        return deco;
    }
    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> strs = Arrays.asList("a", "b", "c");
        System.out.println(codec.decode( codec.encode(strs)));
    }
}
