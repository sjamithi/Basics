import java.util.Scanner;

public class ExcelSheetColumnNumber {
    private String Excel = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private int ExcelNumber(String str) {

        int n = str.length()-1;
        int t = 0;
        int num = 0;
        while (n >= 0) {
            num += (str.charAt(n) - 'A' + 1) * (int)Math.pow(26, t);
            t ++;
            n --;
        }
        return num;
    }

    private String NumToExcel(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int d = num % 26;
            sb.append(Excel.charAt(d - 1));
            num = num/26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Excel Sheet Column");
        String s = sc.next();
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        int n =  excelSheetColumnNumber.ExcelNumber(s);
        System.out.println("Corresponding number is: " + n);
        System.out.println("Excel Sheet is :" +excelSheetColumnNumber.NumToExcel(n));
    }
}
