package Trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumIII {
    private static List<List<Integer>> result = new ArrayList<>();
    private static  List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null)
            return null;
        dfs(root, 0, sum);
//        pathSum(root.left, sum);
//        pathSum(root.right, sum);
        return result;
    }

    private static void dfs(TreeNode root, int curr, int sum) {
        if (root == null)
//            return null;
        if(curr + root.val == sum && root.left == null && root.right == null)
            result.add(new ArrayList<>(root.val));
        else {
            dfs(root.left, curr + root.val, sum);
            dfs(root.right, curr + root.val, sum);
        }
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
