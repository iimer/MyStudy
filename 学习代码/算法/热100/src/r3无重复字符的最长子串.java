import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{09}--20:45
 */
public class r3无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        HashMap<Character,Integer> cache = new HashMap<>();
        int left = -1;
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (cache.containsKey(s.charAt(i))) {
                left = Math.max(left,cache.get(s.charAt(i)));
            }
            max = Math.max(i-left,max);
            cache.put(s.charAt(i),i);
        }
        return max;
    }
}
