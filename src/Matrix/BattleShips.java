package Matrix;

public class BattleShips {
    public static int countBattleships(char[][] board) {
        if (board == null || board.length == 0)
            return 0;

        int count = 0;

        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    count ++;
                    sink(board, i, j);
                }
            }
        }
        return count;
    }

    private static void sink(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'X') {
            return;
        }

        board[i][j] = '.';
        sink(board, i + 1, j);
        sink(board, i - 1, j);
        sink(board, i , j + 1);
        sink(board, i , j - 1);
    }

    public static void main(String[] args) {
        char [][] grid = {
                { 'X','.','.','X' },
                {'.','.','.','X' },
                {'.','.','.','X' }
        };
        System.out.println(countBattleships(grid));
    }
}
