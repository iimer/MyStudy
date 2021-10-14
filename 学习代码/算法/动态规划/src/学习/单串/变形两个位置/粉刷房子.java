package 学习.单串.变形两个位置;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:28
 */
public class 粉刷房子 {
    public int minCost(int[][] costs) {
        int m = costs.length;
        int n = 3;
        int[][] dp = new int[m+1][4];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=3; j++) {
                if (j==1) {
                    dp[i][j] = Math.min(dp[i-1][2],dp[i-1][3])+costs[i-1][j-1];
                }
                else if (j==2) {
                    dp[i][j] = Math.min(dp[i-1][1],dp[i-1][3])+costs[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.min(dp[i-1][1],dp[i-1][2])+costs[i-1][j-1];
                }
            }
        }
        return Math.min(dp[m][1],Math.min(dp[m][2],dp[m][3]));
    }
}
