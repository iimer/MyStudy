import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:15
 */
public class 后序遍历 {
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(list,root);
        return  list;
    }
    public void dfs(ArrayList<Integer> list, TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(list,node.left);
        dfs(list,node.right);
        list.add(node.val);
    }
}
