package Trees;

public class InsertBST {
    private static TreeNode insert(TreeNode root, int x) {
        if (root == null) {
            return new TreeNode(x);
        }
        TreeNode curr = root;
        if (curr.val < x) {
            root.right = insert(curr.right, x);
        } else if (curr.val > x) {
            root.left = insert(curr.left, x);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        insert(node, 5);
    }
}
