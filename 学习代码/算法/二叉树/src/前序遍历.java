import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:47
 */


public class 前序遍历 {
    public static void main(String[] args) {

    }
    private class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(){}
    }
    //递归
//    public List<Integer> preorderTraversal(TreeNode root) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        dfs(root,arrayList);
//        return arrayList;
//    }
//    public void dfs(TreeNode node, List<Integer> list) {
//        if (node == null) {
//            return;
//        }
//        list.add(node.val);
//        dfs(node.left,list);
//        dfs(node.right,list);
//    }
    //迭代
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()) {
            while (root!=null) {
                stack.push(root);
                arrayList.add(root.val);
                root = root.left;
            }
            root = stack.pop().right;
        }
        return arrayList;
    }
}
