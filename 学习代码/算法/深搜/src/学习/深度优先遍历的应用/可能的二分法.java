package 学习.深度优先遍历的应用;

import java.util.HashSet;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:25
 */
public class 可能的二分法 {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        boolean[] visited = new boolean[N+1];
        HashSet<Integer>[] adj = new HashSet[N+1];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new HashSet<>();
        }
        for (int i = 0; i < dislikes.length; i++) {
            adj[dislikes[i][0]].add(dislikes[i][1]);
            adj[dislikes[i][1]].add(dislikes[i][0]);
        }
        int[] colors = new int[N+1];
        for (int i = 1; i < N+1; i++) {
            if (!dfs(adj,visited,colors,i)){
                return false;
            }
        }
        return true;
    }
    public boolean dfs(HashSet<Integer>[] adj,boolean[] visited,int[] colors,int i) {
        visited[i] = true;
        for (Integer h:
             adj[i]) {
            if (!visited[h]) {
                colors[h] = 1-colors[i];
                if (!dfs(adj,visited,colors,h)) {
                    return false;
                }
            } else if (colors[h] == colors[i]) {
                return false;
            }
        }
        return true;
    }
}
