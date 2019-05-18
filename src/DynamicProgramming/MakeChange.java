package DynamicProgramming;

public class MakeChange {
    private int makeWays(int[] denoms, int X, int index, int[][]map) {
        if (map[index][X] > 0) {
            return map[index][X];
        }
        int ways = 0;
        int denomAmount = denoms[index];
        if (index >= denoms.length-1)
            return 1;
        for (int i=0; i*denomAmount <= X; i++) {
            int remaining = X - i * denomAmount;
            ways+= makeWays(denoms, remaining, index+1, map);
        }
        map[index][X]=ways;
        return ways;
    }
    public static void main(String[] args) {
        int[] denoms = {25, 10, 5, 1};
        int X = 100;
        MakeChange m = new MakeChange();
        int[][]map = new int[denoms.length][X+1];
        System.out.println(m.makeWays(denoms, X, 0, map));
    }
}
