/**
 * @author qgyiimer
 * @create 2021-{04}--19:56
 */
public class 最大深度 {
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    //自底向上
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
    }
    //自顶而下
//    private int answer;		// don't forget to initialize answer before call maximum_depth
//    private void maximum_depth(TreeNode root, int depth) {
//        if (root == null) {
//            return;
//        }
//        if (root.left == null && root.right == null) {
//            answer = Math.max(answer, depth);
//        }
//        maximum_depth(root.left, depth + 1);
//        maximum_depth(root.right, depth + 1);
//    }
}
