/**
 * @author qgyiimer
 * @create 2021-{09}--13:45
 */
public class jz13机器人的运动范围 {
    int m;
    int n;
    int k;
    boolean[][] visited;
    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0,0,0,0);
    }

    private int dfs(int i, int j, int si, int sj) {
        if (i>=m || j>=n || visited[i][j] || si+sj>k) {
            return 0;
        }
        visited[i][j] = true;
        return 1+dfs(i+1,j,(i+1)%10==0?si-8:si+1,sj)+dfs(i,j+1,si,(j+1)%10==0?sj-8:sj+1);
    }
}
