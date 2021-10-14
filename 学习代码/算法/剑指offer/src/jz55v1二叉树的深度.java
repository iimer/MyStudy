/**
 * @author qgyiimer
 * @create 2021-{09}--14:31
 */
public class jz55v1二叉树的深度 {
    int max;
    public int maxDepth(TreeNode root) {
        dfs(root,1);
        return max;
    }

    private void dfs(TreeNode root, int i) {
        if (root == null) {
            return;
        }
        max = Math.max(max,i);
        dfs(root.left,i+1);
        dfs(root.right,i+1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
