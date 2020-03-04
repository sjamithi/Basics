package Trees;

public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right==null)
            return 1;
        int leftHeight = 1+ maxDepth(root.left);
        int rightHeight = 1 + maxDepth(root.right);
        return Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(maxDepth(node));
    }
}
