package Numerics;

public class NumberToEnglishSentence {
   private static String[] ones = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static String[] teens = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] bigs = {"", "Thousand", "Million", "Billion"};

    private static String numberToWords(int num) {
        if (num == 0)
            return "Zero";
        int count = 0;
        String str = "";

        while (num > 0) {
            if (num % 1000 != 0) {
                str = numsToHundred(num%1000) + bigs[count] + " " + str;
            }
            count++;
            num = num/1000;
        }
        return str;
    }

    private static String numsToHundred(int n) {
        String s = "";
        if (n > 100) {
            s = ones[n/100 -1] + " Hundred ";
            n = n%100;
        }

        if (n == 10 || n >= 20) {
            s = s + tens[n%10 -1] + " ";
            n = n%10;
        }

        else if (n >= 11 && n <= 19) {
            return s + teens[n -1] + " ";
        }

        if (n >= 1 && n <= 9) {
            s = s + ones[n-1] + " ";
        }
        return s;

    }

        public static void main(String[] args) {
        int number = 1334;
            System.out.println(numberToWords(number));
    }
}
