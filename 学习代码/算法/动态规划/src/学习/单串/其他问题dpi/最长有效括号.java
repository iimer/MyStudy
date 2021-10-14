package 学习.单串.其他问题dpi;

/**
 * @author qgyiimer
 * @create 2021-{09}--10:12
 */
public class 最长有效括号 {
    public int longestValidParentheses(String s) {
        int len = s.length();
        if (len == 0 || len == 1) {
            return 0;
        }
        int max = 0;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                continue;
            } else {
                if (s.charAt(i-1) == '(') {
                    if (i-2 >= 0) {
                        dp[i] = dp[i-2]+1;
                    } else {
                        dp[i] = 1;
                    }
                } else {
                    if (dp[i-1] > 0) {
                        int pre = i - dp[i-1]*2 - 1;
                        if (pre >= 0 && s.charAt(pre) == '(') {
                            if (pre >= 1) {
                                dp[i] = dp[pre-1] + 1 + dp[i-1];
                            } else {
                                dp[i] = 1 + dp[i-1];
                            }
                        }
                    }
                }
            }
            max = Math.max(dp[i],max);
        }
        return max*2;
    }
}
