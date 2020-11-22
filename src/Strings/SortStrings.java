package Strings;

import java.util.*;
import java.util.stream.Collectors;

public class SortStrings {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("String01", "String11","", " ", "String2", "String13", "String10", "String21");
        wrong(inputs);
        System.out.println(sortMe(inputs));
        System.out.println(sortUsingStreams(inputs));
    }

    private static List<String> sortUsingStreams(List<String> input) {
        List<String> str = new ArrayList<>();
       int[] arr = input.stream().filter(s -> s.trim().length() > 0)
                .map(s -> s.substring(6))
                .mapToInt(Integer::parseInt).sorted().toArray();

       for (int i: arr) {
           str.add("String" + i);
       }
                return str;
    }

    private static void wrong(List<String> inputs) {
         Collections.sort(inputs);
        System.out.println(inputs);
    }

    private static List<String> sortMe(List<String> inputs) {
        //This doesn't work as it sorts based off of string values
//        Collections.sort(inputs);
        List<Integer> ints = new ArrayList<>();
        List<String> res= new ArrayList<>();
        for (String s: inputs) {
            if (s == null || s.trim().length() == 0) {
                continue;
            }
            int i = Integer.parseInt(s.substring(6));
            ints.add(i);
        }

        Collections.sort(ints);
        for (int i: ints) {
            res.add("String" + i);
        }
        return res;
    }

}
