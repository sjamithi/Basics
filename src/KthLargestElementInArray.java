import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    private static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i: arr) {
            heap.add(i);
        }
        int temp = 0;
        while(k-- > 0) {
            temp = heap.poll();
        }
        return temp;
    }

    private static int[] kmin(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.naturalOrder());
        int [] res = new int[k];
        for (int i: arr) {
            heap.add(i);
        }
        for (int i=0; i<k; i++) {
            res[i] = heap.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargest(arr, k));
        int[] res =  kmin(arr, k);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
