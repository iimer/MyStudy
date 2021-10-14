package 学习.深度优先遍历的应用;

/**
 * @author qgyiimer
 * @create 2021-{04}--21:40
 */
public class 求根到叶子节点数字之和 {
    int sum =0;
    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root,0);
        return sum;
    }
    public void dfs(TreeNode root,int sumNow) {
        if (root == null) {
            return;
        }
        sumNow = 10*sumNow + root.val;
        if (root.left==null && root.right == null) {
            sum+=sumNow;
        }
        dfs(root.left,sumNow);
        dfs(root.right,sumNow);
    }
}
