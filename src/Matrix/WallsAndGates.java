package Matrix;

public class WallsAndGates {
    private static void wallAndGates(int[][] grid) {
        for (int i=0; i< grid.length; i++ ) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i, j, 0);
                }
            }
        }

        for (int i=0; i< grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void dfs(int[][] grid, int i, int j, int count) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length ||
        grid[i][j] < count)
            return;

        grid[i][j] = count;
        dfs(grid, i+1, j, count+1);
        dfs(grid, i-1, j, count+1);
        dfs(grid, i, j+1, count+1);
        dfs(grid, i, j-1, count+1);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {
                {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
                {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        for (int i=0; i< grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        wallAndGates(grid);
    }
}
