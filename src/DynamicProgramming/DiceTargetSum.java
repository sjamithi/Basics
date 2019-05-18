package DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class DiceTargetSum {
    static  Map<Key, Integer> map = new HashMap<>();
    private static int noOfWays(int m, int n, int x) {
     return noOfWays(m,n,x,map);
    }

    private static int noOfWays(int m, int n, int x, Map<Key, Integer> map) {
        int sum = 0;
        if (n < 1 || x < 1)
            return 0;
        if (n == 1 && x > m)
            return 0;
        if (n== 1 && x <=m)
            return 1;

        Key key = new Key(m ,n ,x );
        if (map.containsKey(key))
            return map.get(key);

        for (int i=1; i<=m; i++) {
            sum += noOfWays(m, n-1, x-i, map);
        }

        map.put(key, sum);
        return sum;
    }


    public static void main(String[] args) {
        int m = 4, n = 2, x = 5;
        //m is face value, n is number of dices and X is target value
        System.out.println(noOfWays(m,n,x));
    }
}
