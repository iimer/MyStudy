package 学习.深度优先遍历的应用;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:42
 */
public class 平行课程 {

    public int minimumSemesters(int n, int[][] relations) {
        HashSet<Integer>[] hashSets = new HashSet[n+1];
        for (int i = 1; i < hashSets.length; i++) {
            hashSets[i] = new HashSet<>();
        }
        Boolean[] visited = new Boolean[n+1];
        for (int i = 0; i < relations.length; i++) {
            hashSets[relations[i][1]].add(relations[i][0]);
        }
        int[] sumAll = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            if (dfs(i,hashSets,visited,sumAll,sumAll[0]) == -1) {
                return -1;
            }
        }
        Arrays.sort(sumAll);
        return sumAll[sumAll.length-1];
    }
    public int dfs(int current,HashSet<Integer>[] hashSets,Boolean[] visited,int[] sumAll,int last) {
        if (visited[current]!=null) {
            if (!visited[current]) {
                return sumAll[current];
            } else if (visited[current]){
                return -1;
            }
        }
        if (hashSets[current].size()==0){
            sumAll[current] = 1;
            return 1;
        }
        visited[current] = true;
        int curNow = sumAll[current];
        for (Integer now:
                hashSets[current]) {
            int o = dfs(now,hashSets,visited,sumAll,current)+1;
            if (o-1==-1) {
                return -1;
            }
            sumAll[now] = o;
            sumAll[current] = Math.max(curNow+o,sumAll[current]);
        }
        visited[current] = false;
        return sumAll[current];
    }
}
