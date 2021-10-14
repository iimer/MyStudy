/**
 * @author qgyiimer
 * @create 2021-{09}--10:25
 */
public class r14最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder res = new StringBuilder();
        int j = 0;
        for (;;) {
            if (j>= strs[0].length()) {
                return res.toString();
            }
            char p = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (j>=strs[i].length() || strs[i].charAt(j) != p) {
                    return res.toString();
                }
            }
            res.append(strs[0].charAt(j++));
        }
    }
}
