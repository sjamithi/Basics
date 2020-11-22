public class ProductOfArrayExceptSelf {
    private int[] computeProduct(int[] num) {
        int[] arr = new int[num.length];
        int[] temp = new int[num.length];
        int[] result = new int[num.length];

        arr[0] = num[0];
        temp[temp.length-1] = num[0];

        for (int i = 0; i< num.length-1; i++) {
            arr[i+1] = arr[i] * num[i];
        }

        for (int i = num.length-1; i >0; i--) {
            temp[i-1] = temp[i] * num[i];
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i] * temp[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ProductOfArrayExceptSelf productOfArrayExceptSelf  = new ProductOfArrayExceptSelf();
        int[] res = productOfArrayExceptSelf.computeProduct(arr);
        for(int i: res) {
            System.out.print(i+ " ");
        }

    }
}
