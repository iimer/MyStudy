/**
 * @author qgyiimer
 * @create 2021-{09}--14:10
 */
public class jz54二叉搜索树的第k大节点 {
    int kk;
    int res;
    boolean flag;
    public int kthLargest(TreeNode root, int k) {
        kk = k;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return ;
        }
        if (flag) {
            return ;
        }
        dfs(root.right);
        kk--;
        if (kk == 0) {
            res = root.val;
            flag = true;
            return ;
        }
        dfs(root.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
