package Trees;

import java.util.Stack;

public class SymmetricTree {
    private static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isHelper(root, root);
    }

    private static boolean isHelper(TreeNode p, TreeNode q) {
        if (p == null && q== null)
            return true;
       if (p == null || q == null)
           return false;

       return p.val == q.val && isHelper(p.left, q.right) && isHelper(p.right, q.left);
    }

    private static boolean isSymmIter(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t1 = stack.pop();
            TreeNode t2 = stack.pop();
            if (t1 == null && t2 == null)
                continue;
            if (t1 == null || t2 == null)
                return false;
            if (t1.val != t2.val)
                return false;
            stack.push(t1.left);
            stack.push(t2.right);
            stack.push(t1.right);
            stack.push(t2.left);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);

        System.out.println(isSymmetric(node));
        System.out.println(isSymmIter(node));
    }
}
