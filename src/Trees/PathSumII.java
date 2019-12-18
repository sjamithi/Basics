package Trees;

public class PathSumII {
    private static int count = 0;
    private static int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        dfs(root, 0, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return count;
    }

    private static void dfs(TreeNode root, int curr, int sum) {
        if (root == null)
            return;
        if (curr + root.val == sum)
             count++;
        dfs(root.left, root.val + curr, sum);
        dfs(root.right, root.val + curr, sum);
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
        int res = 0;
        res += pathSum(node, 22);
        System.out.println(res);
    }
}
