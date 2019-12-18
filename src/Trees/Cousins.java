package Trees;

import java.util.Stack;

public class Cousins {
    public static boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) {
            return false;
        }

        int xDepth = getDepth(root, x);
        int yDepth = getDepth(root, y);
        if (xDepth != yDepth) {
            return false;
        }

        return true;
    }

    private static int getDepth(TreeNode root, int val) {
        Stack<TreeNode> stack = new Stack<>();
        int depth = 0;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.peek();
            if (curr.val == val) {
                return depth;
            } else {
                while (curr.left != null) {
                    stack.push(curr.left);
                    depth++;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        System.out.println(Cousins.isCousins(node, 4, 3));
    }
}
