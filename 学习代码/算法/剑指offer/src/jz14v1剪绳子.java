/**
 * @author qgyiimer
 * @create 2021-{09}--14:06
 */
public class jz14v1剪绳子 {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        if (n<=3){
            return n-1;
        }
        //不是参与遍历算出来的，特殊计算
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 4;
        //记住结论：前1,2,3中获得到下一个乘积最大值
        for (int i = 5; i <= n; i++) {
            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2]*2,dp[i-3]*3));
        }
        return dp[n];
    }
}
