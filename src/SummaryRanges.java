import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    private static List<String> ranges(int[] arr) {
        List<String> list = new ArrayList<>();
        int j;
        for (int i=0; i<arr.length; i++) {
            j=i;
            while (i+1 < arr.length && arr[i+1] - arr[i] == 1) {
                i++;
            }
            if (arr[j] != arr[i])
            list.add(arr[j] + "->" + arr[i]);
            else
                list.add(arr[i] + "");
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,3,4,6,8,9};
        System.out.println(ranges(arr));
    }
}
