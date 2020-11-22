package Binary;

public class AddBinary {
    public static String addBinary(String a, String b) {
       StringBuilder sb = new StringBuilder();
       int i = a.length()-1, j = b.length()-1, carry = 0;

       while (i >= 0 || j >= 0) {
           int sum = 0;
           if (i >= 0 )
               sum += carry + a.charAt(i--) - '0' ;
           if (j >= 0)
               sum += carry + b.charAt(j--) - '0';

           sb.insert(0, sum %2);

           carry = sum /2;
       }

       if (carry > 0) {
           sb.insert(0, carry);
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String a = "11", b = "1";
        System.out.println( addBinary(a ,b));
    }
}
