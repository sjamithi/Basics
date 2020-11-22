package Binary;

public class SwapAllEvenOddBits {

    //0xAAAAAAAA is 32 bit number with all even bits as 1 and odd bits as 0
    // 0x55555555 is 32 bit number with all odd bits as 1 and even bits as 0
    private static int swapBits(int n) {

        System.out.println(n);
        //get all even bits of x
        int evenBits = n & 0xAAAAAAAA;

        System.out.println(evenBits);

        //get all odd bits of x
        int oddBits = n & 0x555555;

        System.out.println(oddBits);

        //right shift
        evenBits >>= 1;

        System.out.println(evenBits);

        //left shift
        oddBits <<= 1;

        System.out.println(oddBits);

        System.out.println(evenBits | oddBits);

        return (evenBits | oddBits);
    }

    public static void main(String[] args) {

        int x = 23; // 00010111

        // Output is 43 (00101011)
        System.out.println(swapBits(x));
    }
}
