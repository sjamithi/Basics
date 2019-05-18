import java.util.*;

public class MostRepeatedCharacter {
    private static char mostRepeated(String s) {
     int[] asc = new int[256];
     int max = -1;
     char cmax = ' ';
     for (char c: s.toCharArray()) {
         asc[c]++;
     }

     for (int i=0; i<s.length(); i++) {
         if (asc[s.charAt(i)] > max) {
             max = asc[s.charAt(i)];
             cmax = s.charAt(i);
         }
     }
     return cmax;
    }

    private static char mostRep(String s) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        heap.addAll(map.keySet());
        return heap.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println(mostRepeated(str));
        System.out.println(mostRep(str));
    }
}
