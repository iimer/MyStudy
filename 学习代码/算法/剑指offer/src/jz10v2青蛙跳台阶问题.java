/**
 * @author qgyiimer
 * @create 2021-{09}--16:16
 */
public class jz10v2青蛙跳台阶问题 {
    public int numWays(int n) {
        if (n==0){
            return 1;
        }
        if (n==1) {
            return 1;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%(int)(1e9+7);
        }
        return dp[n-1];
    }
}
