import java.util.Scanner;

public class IntegerToRoman {
    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private String strs[] = {"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    private String intToRoman(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< values.length; i++) {
            while(values[i] <= n) {
                n = n- values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        IntegerToRoman integer = new IntegerToRoman();
        System.out.println(integer.intToRoman(n));
    }
}
