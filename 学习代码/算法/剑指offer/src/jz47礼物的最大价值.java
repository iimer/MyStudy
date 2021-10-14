/**
 * @author qgyiimer
 * @create 2021-{09}--16:36
 */
public class jz47礼物的最大价值 {
    public int maxValue(int[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
