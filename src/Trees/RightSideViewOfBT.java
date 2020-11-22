package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfBT {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();

        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i< size; i++) {
                TreeNode temp = queue.poll();
                if (i == size-1) {
                    res.add(temp.val);
                }

                if (temp.left != null) {
                    queue.offer(temp.left);
                }

                if (temp.right != null) {
                    queue.offer(temp.right);
                }
            }
        }

        return res;
      }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        System.out.println(rightSideView(node));
    }
}
