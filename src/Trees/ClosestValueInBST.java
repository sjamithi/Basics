package Trees;

public class ClosestValueInBST {
    public static int closestValue(TreeNode root, double target) {
        int res = root.val;
      while (root != null) {
          if (Math.abs(root.val - target) < Math.abs(res - target)) {
              res = root.val;
          }
          root = root.val > target ? root.left: root.right;
      }
      return res;
    }

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(4);
        root.left  = new TreeNode(2);
        root.right= new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
//        TreeNode root = new TreeNode(1);
//        root.right = new TreeNode(2);
        System.out.println(closestValue(root,3.714286));
    }
}
