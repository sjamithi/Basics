package Trees;

public class SameTree {

    private static boolean isSameTree(TreeNode p, TreeNode q) {
      if (p== null && q== null)
          return true;
      if (p == null || q == null)
          return false;
      if (p.val != q.val)
          return false;
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);

        TreeNode node2 = new TreeNode(1);
        node2.right = new TreeNode(2);

        System.out.println(isSameTree(node, node2));
    }
}
