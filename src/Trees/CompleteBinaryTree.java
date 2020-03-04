package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {

    public static boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean hasNull = false;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            if (temp == null) {
                hasNull = true;
            } else {
                    queue.offer(temp.left);
                    queue.offer(temp.right);
            }

            if (temp != null && hasNull)
               return false;
        }
        return hasNull;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        System.out.println(isCompleteTree(node));
    }
}
