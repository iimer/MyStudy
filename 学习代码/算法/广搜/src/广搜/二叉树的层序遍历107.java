package 广搜;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class 二叉树的层序遍历107 {
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
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		
		List<List<Integer>> listOrder = new LinkedList<List<Integer>>();
		if (root==null) {
			return listOrder;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			List<Integer> list = new ArrayList<Integer>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				TreeNode left = node.left;
				TreeNode right = node.right;
				if (left!=null) {
					queue.offer(left);
				}
				if (right!=null) {
					queue.offer(right);
				}
			}
			listOrder.add(0,list);
		}
		
		return listOrder;
    }
	
}
