package Trees;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IncreasingBST {
    static List<Integer> res = new LinkedList<>();
    public static TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        inOrder(root);
        return construct(res);
    }

    private static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            res.add(root.val);
            inOrder(root.right);
        }
    }

    private static TreeNode construct(List<Integer> res) {
        TreeNode mainRoot = new TreeNode(res.get(0));
        TreeNode root = mainRoot;
        for (int i=1; i<res.size(); i++) {
            root.right = new TreeNode(res.get(i));
            root = root.right;
        }
        return mainRoot;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(5);
        node.left = new TreeNode(3);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(4);
        node.left.left.left = new TreeNode(1);
        node.right = new TreeNode(6);
        node.right.right = new TreeNode(8);
        node.right.right.right = new TreeNode(9);
        node.right.right.left = new TreeNode(7);
        System.out.println(increasingBST(node));
    }
}
