package Trees;

public class SearchBST {
    private static TreeNode search(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        TreeNode curr = root;
        if (curr.val < val) {
            return search(curr.right, val);
        } else if (curr.val > val) {
            return search(curr.left, val);
        } else if ( curr.val == val) {
            return curr;
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        System.out.println(search(node, 2));
    }
}
