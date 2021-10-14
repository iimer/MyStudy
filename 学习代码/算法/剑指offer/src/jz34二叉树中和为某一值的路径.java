import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--15:58
 */
public class jz34二叉树中和为某一值的路径 {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> tmp = new LinkedList<>();
        dfs(root,target,tmp);
        return res;
    }

    private void dfs(TreeNode root, int target,List<Integer> tmp) {
        if (root == null) {
            return;
        }
        target = target - root.val;
        tmp.add(root.val);
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<>(tmp));
            tmp.remove(tmp.size()-1);
            return;
        }
        dfs(root.left,target,tmp);
        dfs(root.right,target,tmp);

        tmp.remove(tmp.size()-1);
    }

    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
   }
}
