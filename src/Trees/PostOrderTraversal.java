package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static List<Integer> postOrder(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return res;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if (temp.right == null && temp.left == null) {
                res.add(temp.val);
                stack.pop();
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
      return res;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        System.out.println(postOrder(node));
    }
}
