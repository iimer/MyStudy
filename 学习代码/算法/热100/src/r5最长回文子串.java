/**
 * @author qgyiimer
 * @create 2021-{09}--21:09
 */
public class r5最长回文子串 {
    public String longestPalindrome(String s) {
        boolean[][] isOrNo = new boolean[s.length()][s.length()];
        int max = 1;
        int begin = 0;
        for (int i = 0; i < s.length(); i++) {
            isOrNo[i][i] = true;
        }
        for (int i = 2; i <= s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                int k = j+i-1;
                if (k>=s.length()) {
                    break;
                }
                isOrNo[j][k] = (s.charAt(j) == s.charAt(k)) && (k-j<3 || isOrNo[j+1][k-1]);
                if (isOrNo[j][k]) {
                    if (i>max) {
                        max = i;
                        begin = j;
                    }
                }
            }
        }
        return s.substring(begin,begin+max);
    }
}
