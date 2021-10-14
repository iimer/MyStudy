import java.util.*;

/**
 * @author qgyiimer
 * @create 2021-{09}--14:54
 */
public class jz32v3从上到下打印二叉树III {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            List<List<Integer>> res = new ArrayList<>();
            if(root != null) queue.add(root);
            while(!queue.isEmpty()) {
                LinkedList<Integer> tmp = new LinkedList<>();
                for(int i = queue.size(); i > 0; i--) {
                    TreeNode node = queue.poll();
                    if(res.size() % 2 == 0) tmp.addLast(node.val); // 偶数层 -> 队列头部
                    else tmp.addFirst(node.val); // 奇数层 -> 队列尾部
                    if(node.left != null) queue.add(node.left);
                    if(node.right != null) queue.add(node.right);
                }
                res.add(tmp);
            }
            return res;
        }
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int sum = 1;
        List<Integer> ress = new ArrayList<>();
        boolean flag= true;
        Deque<TreeNode> stack = new LinkedList<>();
        while (!queue.isEmpty()) {
            sum--;
            final TreeNode remove = queue.removeFirst();
            ress.add(remove.val);
            if (flag) {
                if (remove.left != null) {
                    stack.addFirst(remove.left);
                }
                if (remove.right != null) {
                    stack.addFirst(remove.right);
                }
            } else {
                if (remove.right != null) {
                    stack.addFirst(remove.right);
                }
                if (remove.left != null) {
                    stack.addFirst(remove.left);
                }
            }
            if (sum == 0) {
                res.add(new ArrayList<>(ress));
                ress.clear();
                queue.addAll(stack);
                stack.clear();
                sum = queue.size();
                flag = !flag;
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
