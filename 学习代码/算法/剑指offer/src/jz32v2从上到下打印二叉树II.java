import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--14:18
 */
public class jz32v2从上到下打印二叉树II {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int sum = 1;
        List<Integer> ress = new ArrayList<>();
        while (!queue.isEmpty()) {
            sum--;
            final TreeNode remove = queue.removeFirst();
            ress.add(remove.val);
            if (remove.left != null) {
                queue.addLast(remove.left);
            }
            if (remove.right != null) {
                queue.addLast(remove.right);
            }
            if (sum == 0) {
                res.add(new ArrayList<>(ress));
                ress.clear();
                sum = queue.size();
            }
        }
        return res;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
