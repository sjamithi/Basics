package Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MinAdjSwapsRedBalls {

    // Minimum swaps to make all Red balls adjacent to each other
    private static int minSwaps (String s) {
        int swaps = 0;
        List<Integer> redIndices = new LinkedList<>();

        for (int i = 0; i< s.length(); i++) {
            if (s.charAt(i) == 'R') {
                redIndices.add(i);
            }
        }

        for (int i = 0; i< redIndices.size()-1; i++) {
            if (redIndices.get(i+1) - redIndices.get(i) > 1) {
                swaps += (redIndices.get(i+1) - redIndices.get(i)) -1;
            }
        }


        return swaps;
    }
    public static void main(String[] args) {
        String s = "RRWWWRW";
        System.out.println(minSwaps(s));
    }
}
