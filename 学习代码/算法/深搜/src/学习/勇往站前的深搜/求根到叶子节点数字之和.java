package 学习.勇往站前的深搜;

/**
 * @author qgyiimer
 * @create 2021-{04}--20:20
 */
public class 求根到叶子节点数字之和 {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root,new StringBuilder());
        return sum;
    }
    public void dfs(TreeNode root,StringBuilder stringBuilder) {
        if (root == null) {
            return;
        }
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder);
        stringBuilder.append(root.val);
        if (root.left == null && root.right==null) {
            sum+=Integer.parseInt(String.valueOf(stringBuilder));
            return;
        }
        dfs(root.left,stringBuilder1);
        dfs(root.right,stringBuilder1);
    }
}
