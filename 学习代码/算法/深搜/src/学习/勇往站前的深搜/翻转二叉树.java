package 学习.勇往站前的深搜;

/**
 * @author qgyiimer
 * @create 2021-{04}--20:06
 */
public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode node = root.right;
        root.right = root.left;
        root.left = node;
        invert(root.left);
        invert(root.right);
    }
}
