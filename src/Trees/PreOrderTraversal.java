package Trees;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (null == root) {
            return res;
        }
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);

            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

        return res;
    }
        public static void main(String[] args) {
            TreeNode node = new TreeNode(1);
            node.left = new TreeNode(2);
            node.right = new TreeNode(3);
            node.left.left = new TreeNode(4);
            node.left.right = new TreeNode(5);
            node.left.right.left = new TreeNode(6);
            System.out.println(preOrder(node));
        }
}
