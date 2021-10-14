package 深搜;

public class 面试题0404 {

	boolean flag = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public class  TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public boolean isBalanced(TreeNode root) {
        return flag;
    }
	
	public int dfs(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = dfs(root.left);
		int right = dfs(root.right);
		if (Math.abs(left - right) > 1) {
			flag = false;
		}
		return Math.max(left, right)+1;
	}
}
