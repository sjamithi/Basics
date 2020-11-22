package Arrays;

public class ParticleVelocity {

    private static boolean isStable(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int  j, vel = arr[1] - arr[0];
        for (int i = 1; i< arr.length-1; i++) {
            j = i+1;

            if (arr[j] - arr[i] != vel) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new  int[] {1,1,2,5,7};
        System.out.println(isStable(arr));
    }
}
