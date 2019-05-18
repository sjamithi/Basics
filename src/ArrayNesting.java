public class ArrayNesting {
    private static int nest(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int res=0;
        for(int i=0; i<nums.length; i++) {
            if(!visited[i]) {
                int start = nums[i], count=0;
                do {
                    start = nums[start];
                    count++;
                    visited[start] = true;
                } while (start != nums[i]);
                res = Math.max(res, count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] A = {5,4,0,3,1,6,2};
        System.out.println(nest(A));
    }
}
