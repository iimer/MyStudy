/**
 * @author qgyiimer
 * @create 2021-{09}--10:48
 */
public class jz49丑数 {
    public int nthUglyNumber(int n) {
        if (n==0) {
            return 0;
        }
        int a=0,b=0,c=0;
        int[] dp =new int[n];
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[a]*2,Math.min(dp[b]*3,dp[c]*5));
            if (dp[i] == dp[a]*2) {
                a++;
            }
            if (dp[i] == dp[b]*3) {
                b++;
            }
            if (dp[i] == dp[c]*5){
                c++;
            }
        }
        return dp[n-1];
    }
}
