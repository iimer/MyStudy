import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{09}--16:48
 */
public class jz48最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] dp =new int[s.length()+1];
        HashMap<Character,Integer> cache = new HashMap<>();
        dp[0] = 0;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (cache.containsKey(s.charAt(i-1))) {
                dp[i] = Math.min(dp[i-1]+1,i-1-cache.get(s.charAt(i-1)));
                cache.put(s.charAt(i-1),i-1);
            } else {
                dp[i] = Math.min(dp[i-1]+1,i);
                cache.put(s.charAt(i-1),i-1);
            }
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
