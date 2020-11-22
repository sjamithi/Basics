package Matrix;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {
    private static int[][] kclosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        int[][] result = new int[k][2];
        for (int[] point: points) {
            queue.add(point);

            if (queue.size() > k) {
                queue.poll();
            }
        }

        while (k > 0) {
            result[--k] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] graph = new int[][] {{-5,4},{-6,-5},{4,6}};
        int K = 2;

       int[][] res = kclosest(graph, K);
        Arrays.stream(res).forEach(i -> System.out.println(i[0] + "," + i[1]));
    }
}
