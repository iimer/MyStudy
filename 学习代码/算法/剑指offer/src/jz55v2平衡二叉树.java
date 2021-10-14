/**
 * @author qgyiimer
 * @create 2021-{09}--14:42
 */
public class jz55v2平衡二叉树 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (!flag) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left-right > 1 || left-right < -1) {
            flag = false;
            return 0;
        }
        return Math.max(left,right)+1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
