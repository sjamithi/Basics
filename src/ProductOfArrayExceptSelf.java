public class ProductOfArrayExceptSelf {
    private int[] computeProduct(int[] num) {
        int[] result = new int[num.length];
        int[] t1 = new int[num.length];
        int[] t2 = new int[num.length];

        t1[0] = 1;
        t2[num.length -1] = 1;

        for (int i=0; i<num.length-1; i++) {
            t1[i+1] = t1[i] * num[i];
        }

        for (int i=num.length-1; i>0; i--) {
            t2[i-1] = t2[i] * num[i];
        }

        for (int i=0; i<num.length; i++) {
            result[i] = t1[i] * t2[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf  = new ProductOfArrayExceptSelf();
        int[] res = productOfArrayExceptSelf.computeProduct(arr);
        for(int i: res) {
            System.out.println(i);
        }

    }
}
