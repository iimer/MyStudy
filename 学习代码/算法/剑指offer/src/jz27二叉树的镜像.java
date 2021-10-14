/**
 * @author qgyiimer
 * @create 2021-{09}--17:26
 */
public class jz27二叉树的镜像 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        dfs(root.left,root.right);
        return root;
    }

    private void dfs(TreeNode left, TreeNode right) {

        if (left != null) {
            TreeNode temp = left.left;
            left.left = left.right;
            left.right = temp;
            dfs(left.left,left.right);
        }
        if (right != null) {
            TreeNode temp = right.right;
            right.right = right.left;
            right.left = temp;
            dfs(right.left,right.right);
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
