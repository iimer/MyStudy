package 学习.深度优先遍历的应用;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:03
 */
public class 二分图 {
    int[] colors;
    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        colors = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!dfs(graph,i,visited)){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph,int i,boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < graph[i].length; j++) {
            if (!visited[j]) {
                colors[j] = 1- colors[i];
                if (!dfs(graph,j,visited)){
                    return false;
                }
            } else if (colors[j] == colors[i]){
                return false;
            }
        }
        return true;
    }
}
