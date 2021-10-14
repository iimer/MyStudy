/**
 * @author qgyiimer
 * @create 2021-{04}--20:45
 */
public class 路径总和 {
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right==null && root.val == targetSum) {
            return true;
        }
        return hasPathSum(root.left,targetSum- root.val) || hasPathSum(root.right,targetSum- root.val);
    }
}
