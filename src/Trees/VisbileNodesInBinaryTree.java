package Trees;

import java.util.ArrayList;
import java.util.List;

public class VisbileNodesInBinaryTree {

    private static List<Integer> list = new ArrayList<>();
    //  if in the path from root to the node A, there is no node with greater value than A’s, this node A is visible.
    private static int visibleCount(TreeNode root) {
        int count = 0;

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left != null && root.val > root.left.val || root.right != null && root.val > root.right.val) {
            count++;
        }

        count += visibleCount(root.left);
        count += visibleCount(root.right);

        return count;
    }

    private static int visibleCountOptimal(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }

        if (root.val > max) {
            list.add(root.val);
            max = Math.max(root.val, max);
        }

        visibleCountOptimal(root.left, max);
        visibleCountOptimal(root.right, max);

        return list.size();
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(3);
        tree.left.left = new TreeNode(20);
        tree.left.right = new TreeNode(21);
        tree.right = new TreeNode(10);
        tree.right.left = new TreeNode(1);

        System.out.println(visibleCount(tree));
        System.out.println(visibleCountOptimal(tree, 0));

    }
}
