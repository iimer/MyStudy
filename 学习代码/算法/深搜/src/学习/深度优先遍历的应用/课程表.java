package 学习.深度优先遍历的应用;

import java.util.HashSet;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:02
 */
public class 课程表 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashSet<Integer>[] hashSets = new HashSet[numCourses];
        for (int i = 0; i < hashSets.length; i++) {
            hashSets[i] = new HashSet<>();
        }
        Boolean[] visited = new Boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            hashSets[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (dfs(i,hashSets,visited)) {
                return true;
            }
        }
        return false;
    }
    public boolean dfs(int current,HashSet<Integer>[] hashSets,Boolean[] visited) {
        if (visited[current]!=null) {
            return visited[current];
        }
        visited[current] = true;
        for (Integer now:
             hashSets[current]) {
            if (dfs(now,hashSets,visited)) {
                return true;
            }
        }
        visited[current] = false;
        return false;
    }
}
