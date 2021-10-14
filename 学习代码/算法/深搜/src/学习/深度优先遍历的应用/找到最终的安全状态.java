package 学习.深度优先遍历的应用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--10:44
 */
public class 找到最终的安全状态 {
    boolean[] visited;
    List<Integer> notGood;
    int[][] gra;
    public List<Integer> eventualSafeNodes(int[][] graph) {
        visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            System.out.println(visited[i]);
        }
        notGood = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        gra = graph;
        for (int i = 0; i < graph.length; i++) {
            Arrays.fill(visited,false);
            if (!notGood.contains(i)) {
                if (!dfs(i,i)) {
                    list.add(i);
                } else {
                    for (int j = 0; j < visited.length; j++) {
                        if (visited[i]){
                            notGood.add(i);
                        }
                    }
                }
            }
        }
        return list;
    }
    public boolean dfs(int source,int target) {
        visited[source] = true;
        if (source == target) {
            return true;
        }
        for (int i = 0; i < gra[source].length; i++) {
            if (!visited[i]){
                if (dfs(gra[source][i],target)) {
                    return true;
                }
            }
        }
        return false;
    }
}
