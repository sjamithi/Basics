package Strings;

import java.util.*;

public class AlienDictionary {
    public static String alienOrder(String[] words) {
      /*  int[] alphabet = new int[26];
        String order = "";
        int j = 0;

        int min = Arrays.stream(words).mapToInt(s -> s.length()).min().getAsInt();
        for (int k = 0; k < min; k ++) {
        for (int i = 0; i < words.length; i++) {
                int firstchar = words[i].charAt(k) - 'a';
                if (alphabet[j] == 0)
                alphabet[j++] = firstchar;
                else
                    continue;
            }
        }

//        Arrays.stream(alphabet).forEach(i -> System.out.print(i + " "));
        int[] chars = Arrays.stream(alphabet).filter(i -> i!= 0).map(i -> (char)i + 'a').distinct().toArray();
        System.out.println();

        for(int i: chars) {
            order += (char) i;
        }

        return order;*/

        String order = "";
        if (words == null || words.length == 0) {
            return order;
        }

        Map<Character, Integer> degree = new HashMap<>();
        Map<Character, Set<Character>> map = new HashMap<>();

        for (String s: words) {
            for (char c: s.toCharArray()) {
                degree.put(c, 0);
            }
        }

        for (int i = 0; i< words.length-1; i++) {
            String curr = words[i];
            String next = words[i + 1];

            int min = Math.min(curr.length(), next.length());

            for (int j = 0; j < min; j++) {
                char c1 = curr.charAt(j);
                char c2 = next.charAt(j);

                if (c1 != c2) {
                    Set<Character> set = new HashSet<>();

                    if (map.containsKey(c1)) {
                        set = map.get(c1);
                    }

                    if (!set.contains(c2)) {
                        set.add(c2);
                        map.put(c1, set);
                        degree.put(c2, degree.get(c2) + 1);
                    }
                    break;
                }
            }

        }
            Queue<Character> queue = new LinkedList<>();
            for (char c: degree.keySet()) {
                if (degree.get(c) == 0) {
                    queue.add(c);
                }
            }

            while (!queue.isEmpty()) {
                char c = queue.remove();
                order += c;

                if (map.containsKey(c)) {
                    for(char c2: map.get(c)) {
                        degree.put(c2, degree.get(c2)-1);

                        if (degree.get(c2) == 0)
                            queue.add(c2);
                    }
                }
            }
       if (order.length() != degree.size()) {
           return "";
       }
        return order;
    }
    public static void main(String[] args) {
//        String[] arr = new String[] { "wrt",
//                "wrf",
//                "er",
//                "ett",
//                "rftt"};

        String[] arr = new String[]{"abc","ab"};

        System.out.println(alienOrder(arr));
    }
}
