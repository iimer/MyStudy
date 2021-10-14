

/**
 * @author qgyiimer
 * @create 2021-{04}--20:51
 */
public class 对陈二叉树 {
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricc(root.left, root.right);
    }
    public  boolean  isSymmetricc(TreeNode left, TreeNode right){
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null || left.val != right.val) {
            return false;
        }
        return isSymmetricc(left.left,right.right) && isSymmetricc(left.right,right.left);
    }
}
