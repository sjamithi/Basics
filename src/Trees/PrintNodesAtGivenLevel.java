package Trees;

public class PrintNodesAtGivenLevel {

    public static void printAtKLevel(TreeNode root, int k) {
        if (root == null)
            return;
        if (k == 1) {
            System.out.print(root.val + ", ");
            return;
        }
        printAtKLevel(root.left, k-1);
        printAtKLevel(root.right, k-1);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.left.left = new TreeNode(8);
        node.left.right = new TreeNode(11);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        printAtKLevel(node, 3);
    }
}
