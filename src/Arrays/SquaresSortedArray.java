package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquaresSortedArray {
    private static int[] sortedSquaresArray (int[] ints) {
        List<Integer> res = new ArrayList<>();
        for (int i: ints) {
            res.add(i*i);
        }
        Collections.sort(res);
        return res.stream().mapToInt(i ->i).toArray();
    }
    public static void main(String[] args) {
        int[] input = {-7,-3,2,3,11};
        int[] output = sortedSquaresArray(input);
        for (int i: output) {
            System.out.print(" " + i);
        }
    }
}
