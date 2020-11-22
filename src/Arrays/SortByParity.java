package Arrays;

import java.util.Arrays;

public class SortByParity {
    private static int[] sortArrayByParityII(int[] A) {
        int[]even = new int[A.length/2];
        int[] odd = new int[A.length/2];
        int[] res = new int[A.length];
        int e=0, o=0;
        for (int i=0; i<A.length; i++) {
            if (A[i] %2 == 0) {
                even[e++] = A[i];
            } else if (A[i] %2 != 0) {
                odd[o++] = A[i];
            }
        }
        e = 0; o = 0;
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i=0; i<res.length; i++) {
            if(i%2 ==0) {
                res[i] = even[e++];
            } else if (i%2 !=0) {
                res[i] = odd[o++];
            }
        }
        return res;
    }

    private static int[] sortByParity(int[] arr) {
        int[] res = new int[arr.length];
        int e = 0, o = 1;

        for (int i: arr) {
            if (i%2 == 0) {
                res[e] = i;
                e+=2;
            } else if (i%2 !=0) {
                res[o] = i;
                o +=2;
            }
        }
        return res;
    }

    private static int[] sortByPar(int[] arr) {
        int e = 0;

        for (int i=0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                int temp = arr[i];
                arr[i] = arr[e];
                arr[e++] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,7};
        int[] res = sortArrayByParityII(arr);
        for (int i: res) {
            System.out.print(i + "  ");
        }

        System.out.println("-=-=-=-=-=-=-=");
        int[] result = sortByParity(arr);
        for (int i: result) {
            System.out.print(i + "  ");
        }

        Arrays.stream(sortByPar(arr)).forEach(System.out::print);
    }
}
