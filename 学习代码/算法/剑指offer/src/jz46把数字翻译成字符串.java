/**
 * @author qgyiimer
 * @create 2021-{09}--16:14
 */
public class jz46把数字翻译成字符串 {
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length()+1];
        if (str.length() == 1) {
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            if (str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1)<='5')) {
                dp[i] = dp[i-1]+dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
