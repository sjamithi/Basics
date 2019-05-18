import java.util.Scanner;

public class Fibonacci {

    private static int fibRec(int n) {
        if (n == 0)
            return 0;
        if (n ==1)
            return 1;
        return fibRec(n-1) + fibRec(n-2);
    }

    private static int fibIter(int n) {
        int a = 0, b=1, c = 0;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<=n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        return c;
    }

    private static int[] dp (int n) {
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<=n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        System.out.println(fibRec(n));
//        fibIter(n);
        int[] res = dp(n);
        for (int i: res) {
            System.out.print(i+ " ");
        }
    }
}
