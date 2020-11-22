package Trees;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestInBST {

    private  static List<Integer> list = new LinkedList<>();
    public static int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return -1;
        dfs(root, k);
        return list.get(k-1);
    }

    private static void dfs(TreeNode root, int k) {
        if (root != null) {
            dfs(root.left, k);
            if (list.size() == k) {
                return;
            } else {
                list.add(root.val);
                dfs(root.right, k);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(3);
        root.left  = new TreeNode(1);
        root.right= new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(kthSmallest(root,1));
    }

}
