package Arrays;

public class ContainerWithMostWater {

    private static int maxArea(int[] input) {
        int area = 0, i=0, j = input.length-1;

       while (i < j) {
            int temp = Math.min(input[i], input[j]) * (j-i);
            area = Math.max(area, temp);
            if (input[i] < input[j])
                i++;
            else
                j--;
        }
        return area;
    }

    public static void main(String[] args) {
        int[] input = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(input));
    }
}
