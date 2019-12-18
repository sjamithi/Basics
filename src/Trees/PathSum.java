package Trees;

import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public static boolean pathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val != sum && root.left == null && root.right == null) {
            return false;
        }
        sum -= root.val;

        if (sum == 0 && root.left == null && root.right == null)
            return true;
        return pathSum(root.left, sum) || pathSum(root.right, sum);
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(4);
        node.left.left = new TreeNode(11);
        node.left.left.left = new TreeNode(7);
        node.left.left.right = new TreeNode(2);
        node.right = new TreeNode(8);
        node.right.right = new TreeNode(4);
        node.right.left = new TreeNode(13);
        node.right.right.right = new TreeNode(1);
        node.right.right.left = new TreeNode(5);
        System.out.println(pathSum(node, 22));
    }
}
