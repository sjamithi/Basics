package Arrays;

import java.util.*;

public class TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);

        for (char c: tasks) {
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        int cycles = 0;
        queue.addAll(map.values());

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i<= n; i++) {
                if (!queue.isEmpty()) {
                    list.add(queue.poll());
                }
            }

            for (int i: list) {
                if (-- i > 0) {
                    queue.add(i);
                }
            }

            cycles += queue.isEmpty() ? list.size() : n+1;
        }

        return cycles;
    }
    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println("No of cycles is: "+leastInterval(tasks, n));
    }
}
