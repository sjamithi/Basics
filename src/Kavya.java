import java.util.*;

public class Kavya {

    private static boolean checkCapitalLetter(String s) {
        if (null == s || s.length() == 0) {
            return false;
        }
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <=91)
                return true;
        }
        return false;
    }

    private static boolean checkCaps_usingJavaInherentMethods(String input) {
       char[] charArray = input.toCharArray();

       for (char c: charArray) {
           if (Character.isUpperCase(c)) {
               return true;
           }
       }
       return false;
    }

    private static int kth (int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.naturalOrder());
        for (int i: arr) {
            queue.add(i);
        }
        int x = 0, res = -1;
        while (x < k) {
            res = queue.poll();
            x++;
        }
        return res;
    }

    private static int[] sortedArray(int[] input) {
        List<Integer> list = new ArrayList<>();
        for (int i: input) {
            list.add(i*i);
        }

        Collections.sort(list);
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give your text");
        String text=sc.nextLine();
        System.out.println(checkCapitalLetter(text));
        System.out.println(checkCaps_usingJavaInherentMethods(text));
        int[] arr = {3,2,1,5,6,4};
        int k = 4;
        System.out.println(kth(arr, k));
        int[] op = sortedArray(new int[] {1, 5, -7});
        for (int i: op) {
            System.out.print(i+" ");
        }
    }
}


