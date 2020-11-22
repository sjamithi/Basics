package Trees;

public class DiameterOfBinaryTree {
    private static int length;
    private static int diameter(TreeNode root) {
        if (root == null)
            return  0;
        dfs(root);
        return length-1;
    }

    private static int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));

        length = Math.max(length, 1 + left + right);

        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        System.out.println(diameter(node));
    }
}
