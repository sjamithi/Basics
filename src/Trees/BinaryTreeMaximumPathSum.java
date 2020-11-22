package Trees;


public class BinaryTreeMaximumPathSum {
    private static int sum = 0;
    public static int maxPathSum(TreeNode root) {
      if (root == null)
          return 0;
       helper(root);
       return sum;
    }

    private static int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(0,  helper(root.left));
        int right = Math.max(0, helper(root.right));
        sum = Math.max(root.val + left + right, sum);
        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(-10);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(maxPathSum(node));
    }
}
