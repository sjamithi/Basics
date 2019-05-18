import java.util.HashSet;
import java.util.Set;

public class SingleElementInArray {
    private int singleElement(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int anArr : arr) {
            if (set.contains(anArr)) {
                set.remove(anArr);
            } else {
                set.add(anArr);
            }
        }
        return set.size() == 1 ? set.iterator().next() : -1;
    }

    private int xorMethod(int[] arr) {
        int a = arr[0];
        for (int i=1; i< arr.length; i++) {
            a = a ^ arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 8, 1, 7, 7, 5, 6, 5, 8, 6};
        SingleElementInArray singleElementInArray = new SingleElementInArray();
        System.out.println("single elem in array is " + singleElementInArray.singleElement(arr));
        System.out.println("single elem using XOR is " + singleElementInArray.xorMethod(arr));
    }
}
