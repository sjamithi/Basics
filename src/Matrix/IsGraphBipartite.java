package Matrix;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static boolean isBipartite(int[][] graph) {
      int len = graph.length;
      int[] colors = new int[len];

      Arrays.fill(colors, -1);

      for (int i = 0; i < len; i++) {
          if (colors[i] == -1) {
              Queue<Integer> queue = new LinkedList<>();

              queue.offer(i);
              colors[i] = 0;

              while (!queue.isEmpty()) {
                  Integer curr = queue.poll();
                  for (int nei: graph[curr]) {
                      if (colors[nei] == -1) {
                          queue.offer(nei);
                          colors[nei] = colors[curr]^ 1;
                      } else if (colors[nei] == colors[curr])
                          return false;
                  }
              }
          }

      }
      return true;
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0,2},
                {1,3}
        };
        System.out.println(isBipartite(graph));
    }
}
