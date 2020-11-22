package Trees;

public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int arr[]) {
        if (arr == null || arr.length == 0)
            return null;
        return createBST(arr, 0 , arr.length-1);
    }

    private static TreeNode createBST(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = start + (end - start) /2;

        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid + 1, end);

        return root;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(arr));
    }
}
