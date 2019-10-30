package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static List<Integer> postOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if (temp.left == null && temp.right == null) {
                TreeNode pop = stack.pop();
                result.add(pop.val);
            } else {
                if (temp.right != null) {
                    stack.push(temp.right);
                    temp.right = null;
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(6);

        System.out.println(postOrder(node));

    }

}
