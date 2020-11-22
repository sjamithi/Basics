package Trees;

public class IsSubTree {
    private static boolean isSubTree(TreeNode s, TreeNode t) {
        if (s == null)
            return false;
        if (isSame(s, t))
            return true;
        return isSubTree(s.left, t) || isSubTree(s.right, t);
    }

    private static boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
        if (s.val != t.val)
            return false;
        return isSame(s.left, t.left) && isSame(s.right, t.right);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(4);
        node.right = new TreeNode(5);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(2);

        TreeNode another = new TreeNode(4);
        another.left = new TreeNode(1);
        another.right = new TreeNode(2);
        System.out.println(isSubTree(node, another));
    }
}

