package Strings;

public class AddTwoStrings {
    public static String addStrings(String num1, String num2) {
     int i = num1.length()-1, j = num2.length()-1, carry = 0;
     StringBuilder sb = new StringBuilder();

     while (i >= 0 || j >= 0) {
         int sum = 0;

         if (i >= 0) {
             sum += num1.charAt(i) - '0';
             i--;
         }

         if (j >= 0) {
             sum += num2.charAt(j) - '0';
             j--;
         }

         sum += carry;

         sb.insert(0, sum % 10);

         carry = sum / 10;
     }

     if (carry > 0) {
         sb.insert(0, carry);
     }
      return sb.toString();
    }
    public static void main(String[] args) {
        String s1 = "98", s2 = "9";
        System.out.println(addStrings(s1, s2));
    }
}
