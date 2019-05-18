import java.util.Arrays;
import java.util.Scanner;

public class BeautifulArrays {
    private void beautifyArrays(int[] arr, int k, int l, int n) {
        Arrays.sort(arr);
        int max = arr[n -1] , target = arr[n /2], ans = Integer.MAX_VALUE;
        while (max >=  target) {
            int bs = 0, as = 0;

            for (int i=0; i< n; i++) {
                if (arr[i] < max)
                    bs += max- arr[i];
                else
                    as += arr[i] - max;
            }
            int temp = as * k + (bs -as) * l;
            if (temp < ans)
                ans = temp;
            max --;
        }
        System.out.println("Minimum cost is: " + ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size, k , l: ");
        int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements ");
        for(int i = 0; i< n; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }

        BeautifulArrays beautifulArrays = new BeautifulArrays();
        beautifulArrays.beautifyArrays(arr, k , l, n);
    }
}
