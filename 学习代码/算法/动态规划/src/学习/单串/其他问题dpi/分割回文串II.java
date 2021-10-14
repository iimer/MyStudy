package 学习.单串.其他问题dpi;

/**
 * @author qgyiimer
 * @create 2021-{04}--12:45
 */
public class 分割回文串II {
    public int minCut(String s) {
        int[] dp = new int[s.length()+1];
        for (int i = 2; i < dp.length; i++) {
            dp[i]=dp[i-1]+1;
            for (int j = i-1; j >0 ; j--) {
                if (s.charAt(i-1) == s.charAt(j-1)) {
                    if (j-1 == 0) {
                        dp[i] = 0;
                    }
                    dp[i] = Math.min(dp[i],dp[j-1]+1);
                }
                if (j>=3) {
                    j-=1;
                    String sub = s.substring(j-1,i-1);
                    StringBuilder stringBuilder = new StringBuilder(sub);
                    if (!stringBuilder.reverse().toString().equals(sub)){
                        break;
                    }
                }else {
                    break;
                }
            }
        }
        return dp[dp.length-1];
    }

}
