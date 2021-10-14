package 学习.深度优先遍历的应用;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--21:21
 */
public class 计算无向图的连通分量邻接表应用 {
    public int countComponents(int n, int[][] edges) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; i++) {
            adj[edges[i][0]].add(edges[i][1]);
            adj[edges[i][1]].add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adj,i,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(List<Integer>[] adj,int start,boolean[] visited) {
        visited[start] = true;
        for (int i = 0; i < adj[start].size(); i++) {
            int target = adj[start].get(i);
            if (!visited[target]){
                dfs(adj,target,visited);
            }
        }
    }
}
