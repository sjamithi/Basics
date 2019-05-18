import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)) {
            set.add(n);

            n = getSum(n);
            if (n==1) {
                return true;
            }
        }
        return false;
    }

    private int getSum(int n) {
        int squares = 0;
        while(n>0) {
            int temp = n % 10;
            squares += temp * temp;
            n = n/10;
        }
        System.out.println(squares);
        return squares;
    }
    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(7));
    }
}
