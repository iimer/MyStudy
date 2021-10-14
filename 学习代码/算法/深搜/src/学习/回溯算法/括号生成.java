package 学习.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:18
 */
public class 括号生成 {
    char[] chars;
    int n;
    List<String> res;
    public List<String> generateParenthesis(int n) {
        chars = new char[]{'(',')'};
        StringBuilder stringBuilder = new StringBuilder();
        this.n = n;
        res = new ArrayList<>();
        backTracking(0,stringBuilder,0,0);
        return res;
    }
    public void backTracking(int i,StringBuilder stringBuilder,int left,int right) {
        if (left>n || right >n || right>left) {
            return;
        }
        if (i>=2*n) {
            res.add(stringBuilder.toString());
            return;
        }
        for (int j = 0; j < 2; j++) {
            if (j==0) {
                left++;
            } else {
                right++;
            }
            stringBuilder.append(chars[j]);
            backTracking(i+1,stringBuilder,left,right);
            if (j==0) {
                left--;
            } else {
                right--;
            }
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
