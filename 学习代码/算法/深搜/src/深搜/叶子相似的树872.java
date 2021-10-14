package 深搜;

import java.util.ArrayList;

public class 叶子相似的树872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
	        ArrayList list1 = new ArrayList();
	        dfs(root1, list1);
	        ArrayList list2 = new ArrayList();
	        dfs(root2, list2);
	        boolean flag = false;
	        if (list1.size() == list2.size()) {
	        	flag = true;
				for (int i = 0; i < list1.size(); i++) {
					if (list1.get(i)!=list2.get(i)) {
						flag = false;
					}
				}
			}
	        if (flag) {
				return true;
			} else {
				return false;
			}
	 }
	 
	 private boolean dfs(TreeNode root,ArrayList list) {
		 // TODO Auto-generated method stub
		 if (root==null) {
		 	 return true;
		 }
		 boolean left = dfs(root.left, list);
		 boolean right = dfs(root.right, list);
		 if (right && left) {
			list.add(root.val);
		}
		 return false;
	}
}
