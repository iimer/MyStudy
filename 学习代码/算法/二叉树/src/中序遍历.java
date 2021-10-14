import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:06
 */
public class 中序遍历 {
    private class TreeNode {
        中序遍历.TreeNode left;
        中序遍历.TreeNode right;
        int val;
        TreeNode(){}
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()) {
            while (root!=null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            arrayList.add(root.val);
            root = root.right;
        }
        return arrayList;
    }
}
