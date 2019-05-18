import java.util.ArrayList;
import java.util.List;

public class TelephoneNumberCombinations {
    private String in;
    private final String[] hash = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> result = new ArrayList<>();
    private TelephoneNumberCombinations(String str) {
        in = str;
    }
    private StringBuilder out = new StringBuilder();

    private List<String> print() {
       return print(in, 0, out);
    }

    private List<String> print(String in, int curr, StringBuilder out) {
        if (out.length() == in.length()) {
            result.add(out.toString());
        }

        while (curr < in.length()) {
            for (int i = 0; i < hash[in.charAt(curr) - '0'].length(); i++) {
                if (in.charAt(curr) - '0' == 0 || in.charAt(curr) - '0' == 1) {
                    curr++;
                    continue;
                }
                out.append(hash[in.charAt(curr) - '0'].charAt(i));
                print(in, curr + 1, out);
                out.deleteCharAt(out.length() -1);
            }
            curr ++;
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "";
        TelephoneNumberCombinations telephoneNumberCombinations = new TelephoneNumberCombinations(str);
        List<String> result = telephoneNumberCombinations.print();
        System.out.println(result);
    }
}
