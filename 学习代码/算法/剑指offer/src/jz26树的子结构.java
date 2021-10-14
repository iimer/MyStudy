import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--17:02
 */
public class jz26树的子结构 {
    List<TreeNode> list = new ArrayList<>();
    int target;
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }
        target = B.val;
        dfs(A);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (dfs2(list.get(i),B)) {
                return true;
            }
        }
        return  false;
    }

    private boolean dfs2(TreeNode A, TreeNode B) {
        if (B ==null) {
            return true;
        }
        if (A==null|| A.val != B.val) {
            return false;
        }
        return dfs2(A.left,B.left) && dfs2(A.right,B.right);
    }

    private void dfs(TreeNode a) {
        if (a == null) {
            return;
        }
        if (a.val == target) {
            list.add(a);
        }
        dfs(a.left);
        dfs(a.right);
    }


    //  Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

}
