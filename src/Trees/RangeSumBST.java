package Trees;

public class RangeSumBST {
    private static int sum = 0;
    private static int rangeSum(TreeNode root, int l, int r) {
        if (root == null)
            return 0;
       dfs(root, l, r);
        return sum;
    }

    private static void dfs(TreeNode root, int l, int r) {
        if (root != null) {
            if (l <= root.val && root.val <= r) {
                sum += root.val;
            }

            if (l < root.val) {
                dfs(root.left, l, r);
            }
            if (root.val <  r) {
                dfs(root.right, l, r);
            }
        }
    }
    public static void main(String[] args) {
        int L = 7, R = 15;

        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(5);
        node.right = new TreeNode(15);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(7);
        node.right.right = new TreeNode(18);
        System.out.println(rangeSum(node, L, R));
    }
}
