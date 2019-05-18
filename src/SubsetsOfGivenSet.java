import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsOfGivenSet {
    private static List<List<Integer>> generateSubsets(List<Integer> set, int index) {
        List<List<Integer>> allSubsets;
        if (set.size() == index) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
        } else {
            allSubsets = generateSubsets(set, index + 1);
            List<List<Integer>> moreSubsets = new ArrayList<>();
            int item = set.get(index);
            for(List<Integer> subset: allSubsets) {
                List<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }
    public static void main(String[] args) {
        List<Integer> set = Arrays.asList(1,2);
        List<List<Integer>> result = generateSubsets(set, 0);

        for(List<Integer> a : result) {
            System.out.println(a);
        }
    }
}
