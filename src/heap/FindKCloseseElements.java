package heap;

import java.util.*;

public class FindKCloseseElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) ->a.getValue() - b.getValue());

        for (int i: arr) {
            int delta = Math.abs(i-x);
            map.put(i, delta);
        }

        queue.addAll(map.entrySet());
        System.out.println(map.entrySet());

        if (queue.size() == 0){
            return new LinkedList<>();
        }
        while (k-- > 0) {
            list.add(queue.poll().getKey());
        }

         Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        int[]arr = {0,1,1,1,2,3,6,7,8,9};
        int k=4, x=9;
        System.out.println(findClosestElements(arr, k, x));
    }
}
