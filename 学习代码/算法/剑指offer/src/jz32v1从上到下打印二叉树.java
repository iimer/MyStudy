import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--14:05
 */
public class jz32v1从上到下打印二叉树 {
    List<Integer> res = new ArrayList<>();
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while (!queue.isEmpty()) {
            final TreeNode remove = queue.removeFirst();
            res.add(remove.val);
            if (remove.left != null) {
                queue.addLast(remove.left);
            }
            if (remove.right != null) {
                queue.addLast(remove.right);
            }
        }
        int[] ress = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ress[i] = res.get(i);
        }
        return ress;
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
