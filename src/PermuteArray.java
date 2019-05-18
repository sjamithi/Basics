import java.util.ArrayList;
import java.util.List;

public class PermuteArray {

    private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> temp, int[] arr) {
        if (temp.size() == arr.length) {
            res.add(new ArrayList<>(temp));
        } else {
            for (int anArr : arr) {
                if (temp.contains(anArr))
                    continue;
                temp.add(anArr);
                backTrack(res, temp, arr);
                temp.remove(temp.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        PermuteArray permuteArray = new PermuteArray();
        System.out.println(permuteArray.permute(nums));
    }
}
