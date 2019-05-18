import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ShuffleDeckOfCards {
    private static Random r = new Random();
    private static void shuffle(int[] cards) {
        for (int i=0; i< cards.length; i++) {
            int t = r.nextInt(cards.length);
            int temp = cards[t];
            cards[t] = cards[i];
            cards[i] = temp;
        }

        System.out.println("Shuffled Array");
        Arrays.stream(cards).forEach(i -> System.out.print(i + " "));
    }
    public static void main(String[] args) {
        int[] cards = IntStream.rangeClosed(1, 52).toArray();
        for (int i: cards) {
            System.out.print(i + " ");
        }
        System.out.println();
        shuffle(cards);
    }
}
