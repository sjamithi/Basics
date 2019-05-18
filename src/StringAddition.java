import java.util.Scanner;

public class StringAddition {
    private static void addition(String a, String b) {
        String res = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        System.out.println(res);
    }

    private static void stringAdditionTOInt(String a, String b) {
        int alen = a.length(), blen = b.length();
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        while (alen > 0 && blen > 0) {
            int sum = carry +  Character.getNumericValue(a.charAt(alen - 1)) +  Character.getNumericValue(b.charAt(blen - 1));
            sb.append(sum % 10);
            carry = sum / 10;
            alen--;
            blen--;
        }

        while (alen >0) {
            int sum = carry +  Character.getNumericValue(a.charAt(alen--));
            sb.append(sum%10);
            carry = sum/10;
        }

        while (blen >0) {
            int sum = carry +  Character.getNumericValue(b.charAt(blen--));
            sb.append(sum%10);
            carry = sum/10;
        }
        if (carry > 0)
        sb.append(carry);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        addition(a, b);
        stringAdditionTOInt(a, b);
    }
}
