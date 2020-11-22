package Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

    public class SerializeAndDeserializeBinaryTree {
        public static String serialize(TreeNode root) {
            if (root == null)
                return null;
            StringBuilder sb = new StringBuilder();
           String s = dfs(root, sb);
           return s;
        }

        private static String dfs(TreeNode root, StringBuilder sb) {
            if (root == null) {
                sb.append("null,");
            } else {
                sb.append(root.val).append(",");
                dfs(root.left, sb);
                dfs(root.right, sb);
            }
                return sb.toString();
        }

        public static TreeNode deserialize(String data) {
            if (data == null || data.length() == 0)
                return new TreeNode(-1);
            String[] arr = data.split(",");
            TreeNode res = construct(new LinkedList<>(Arrays.asList(arr)));
            return res;
        }

        private static TreeNode construct (List<String> list) {
            String val = list.remove(0);

            if (val.equalsIgnoreCase("null") || val.length() == 0)
                return null;
            TreeNode root = new TreeNode(Integer.valueOf(val));
            root.left = construct(list);
            root.right = construct(list);

            return root;
        }

        private static void printTree(TreeNode root) {
            if (root == null)
                return;
            else {
                System.out.println(root.val);
                printTree(root.left);
                printTree(root.right);
            }
        }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        System.out.println(serialize(node));
        TreeNode root = deserialize(serialize(node));
        printTree(root);
        System.out.println(root);
    }
}
