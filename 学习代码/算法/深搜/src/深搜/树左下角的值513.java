package 深搜;

import java.util.ArrayList;
import java.util.List;

public class 树左下角的值513 {
	public static void main(String[] args) {
		
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
	public int findBottomLeftValue(TreeNode root) {
		List<Integer> size = new ArrayList<Integer>();
		List<Integer> val = new ArrayList<Integer>();
		dfs(root, 1,size,val);
		int max = size.get(0);
		int maxIndex = 0;
		for (int i = 1; i < size.size(); i++) {
			if (size.get(i)>max) {
				maxIndex = i;
				max = size.get(i);
			}
		}
		return val.get(maxIndex);
    }
	
	private void dfs(TreeNode root,int num,List size,List val) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			size.add(num);
			val.add(root.val);
		}
		dfs(root.left,num+1,size,val);
		dfs(root.right,num+1,size,val);
	}
}
