package 学习.勇往站前的深搜;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:38
 */
public class 二叉树的最小深度 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return left == 0 || right ==0 ? Math.max(left,right)+1:Math.min(left,right)+1;
    }
}
