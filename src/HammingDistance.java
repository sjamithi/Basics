import java.util.Scanner;

public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println(Integer.toBinaryString(n1));
        int n2 = sc.nextInt();
        System.out.println(Integer.toBinaryString(n2));
        System.out.println(Integer.bitCount(n1^n2));
    }
}
