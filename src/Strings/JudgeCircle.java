package Strings;

import java.util.HashMap;
import java.util.Map;

public class JudgeCircle {
    private boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 1);
        map.put('R', -1);
        map.put('U', 2);
        map.put('D', -2);
        int count = 0;
        for (char c: moves.toCharArray()) {
            count += map.get(c);
        }

        return count == 0;
    }

    private boolean judge(String str) {
        int x=0, y=0;
        for (char c: str.toCharArray()) {
            if (c == 'L')
                x--;
            else if (c == 'R')
                x++;
            else if (c == 'U')
                y++;
            else if (c == 'D')
                y--;
        }

        return x == 0 && y ==0;

    }
    public static void main(String[] args) {
        String input = "LRUD";
        JudgeCircle judgeCircle = new JudgeCircle();
        System.out.println(judgeCircle.judgeCircle(input));
        System.out.println(judgeCircle.judge(input));
    }
}
