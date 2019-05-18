package NestedInteger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WeightSumDFS {
    private static int bfs(List<NestedInteger> list) {
        int total = 0;
        Queue<NestedInteger> queue = new LinkedList<>();
        for (NestedInteger i: list) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int temp = 0, prev = 0;
            int size = queue.size();
            for (int i=0; i<size; i++) {
                NestedInteger current = queue.poll();
                if (current.isInteger()) {
                    temp += current.getInteger();
                }
                List<NestedInteger> currentList = current.getList();
                if (currentList!= null) {
                    for (NestedInteger n: currentList) {
                        queue.offer(n);
                    }
                }
            }
            prev += temp;
            total += prev;
        }

        return total;
    }
    public static void main(String[] args) {
        Queue<NestedInteger> queue = new LinkedList<>();

    }
}
