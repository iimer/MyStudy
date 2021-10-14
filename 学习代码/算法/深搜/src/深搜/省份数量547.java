package 深搜;

public class 省份数量547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findCircleNum(int[][] isConnected) {
		int len = isConnected.length;
		boolean[] visited = new boolean[len];
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				dfs(isConnected, visited, len,i);
				count++;
			}
		}
		return count;
    }
	
	public void dfs(int[][] isConnected,boolean[] visited,int len,int i) {
		for (int j = 0; j < len; j++) {
			if (isConnected[i][j]==1&&!visited[j]) {
				visited[j]=true;
				dfs(isConnected, visited, len, j);
			}
		}
	}
}
