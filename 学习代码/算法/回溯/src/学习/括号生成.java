package 学习;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{06}--17:12
 */
public class 括号生成 {
    int left;
    int right;
    int n;
    public List<String> generateParenthesis(int n) {
        left = 0;
        right = 0;
        this.n = n;
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracking(res,sb);
        return res;
    }

    private void backTracking(List<String> res, StringBuilder sb) {
        if (left == n&&left == right) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < 2; i++) {
            if (i==0){
                if (left<n){
                    sb.append('(');
                    left++;
                    backTracking(res,sb);
                    sb.deleteCharAt(sb.length()-1);
                    left--;
                }
            }else {
                if (left>right&&right<n) {
                    sb.append(')');
                    right++;
                    backTracking(res,sb);
                    sb.deleteCharAt(sb.length()-1);
                    right--;
                }
            }
        }
    }
}
