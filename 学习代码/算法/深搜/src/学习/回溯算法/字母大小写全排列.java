package 学习.回溯算法;



import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:11
 */
public class 字母大小写全排列 {
    StringBuilder stringBuilder;
    int n;
    List<String> res;
    public List<String> letterCasePermutation(String S) {
        stringBuilder = new StringBuilder(S);
        n = S.length();
        res = new ArrayList<>();
        backTracking(0);
        stringBuilder.setCharAt(0,String.valueOf(stringBuilder.charAt(0)).toLowerCase().charAt(0));
        return null;
    }
    public void backTracking(int i) {
        if (i>=n) {
            res.add(stringBuilder.toString());
            return;
        }
        for (int j = 0; j < 2; j++) {

        }
    }
}
