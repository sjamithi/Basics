package Trees;


import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    private static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        return levelOrder(root, result);
    }

    private static List<List<Integer>> levelOrder(TreeNode root, List<List<Integer>> res) {
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> tempList = new ArrayList<>();

            for (int i=0; i<size; i++) {
                TreeNode temp = queue.poll();
                tempList.add(temp.val);

                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
            res.add(tempList);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        System.out.println(levelOrder(node));

        //[
        //  [3],
        //  [9,20],
        //  [15,7]
        //]
    }
}
