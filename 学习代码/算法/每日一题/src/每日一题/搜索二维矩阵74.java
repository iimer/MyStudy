package 每日一题;

public class 搜索二维矩阵74 {
	public static void main(String[] args) {
		
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		int start = 0;
		int end = matrix.length-1;
		int n = matrix[0].length;
		while (start != end) {
			if (target > matrix[start][n-1]) {
				start = (end+start+1)/2;
			} else {
				end = (end+start)/2;
			}
		}
		int h = start;
		start = 0;
		end = n-1;
		while (start!=end) {
			if (target > matrix[h][start]) {
				start = (end+start+1)/2;
			} else {
				end = (end+start)/2;
			}
		}
		if (matrix[h][start] == target) {
			return true;
		} else {
			return false;
		}
    }
}
