public class LargestSecondLargestString {
    private static void largest(String[] arr) {
        String largest = "", second = "";
        for (String s: arr) {
            if (s.trim().length() > largest.length()) {
                second = largest;
                largest = s;
            } else if (s.trim().length() > second.length()) {
                second = s;
            }
        }
            System.out.println("Largest is : "+largest);
            System.out.println("Second largest is: " +second);
    }
    public static void main(String[] args) {
        String[] arr = {"Sandy", "Jamithi", "RangaraoJamithi", "Ramadevi ", "i am testing this to check if this is largest"};
        largest(arr);
    }
}
