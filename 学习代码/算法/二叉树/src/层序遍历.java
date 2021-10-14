import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:33
 */
public class 层序遍历 {
    public static void main(String[] args) {

    }
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();
        if (root==null) {
            return list;
        }
        List<Integer> sub = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int num = queue.size();
            for (int i = 0; i < num; i++) {
                TreeNode node = queue.poll();
                sub.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null) {
                    queue.add(node.right);
                }
            }
            list.add(new ArrayList<>(sub));
            sub.clear();
        }
        return list;
    }
}
