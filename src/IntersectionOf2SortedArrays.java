import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2SortedArrays {
    private static List<Integer> findDuplicates(int[] arr1, int[] arr2) {
        int i=0, j=0;
        List<Integer> result = new ArrayList<>();

        while(i< arr1.length && j< arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++; j++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }
        }

        return result; //[4,12]
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 8, 9, 12, 183, 2^56};
        int[] arr2 = {4,5,12};
        System.out.println(findDuplicates(arr1, arr2));
    }
}
