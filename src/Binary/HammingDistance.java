package Binary;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int result = 0;

        while (x > 0 || y > 0) {
            result += (x % 2) ^ (y % 2);
            x /= 2; y /= 2;
        }

        return result;
    }

    private static int numberOfBits(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        int x = 2, y = 4;
        System.out.println(hammingDistance(x, y));
    }
}
