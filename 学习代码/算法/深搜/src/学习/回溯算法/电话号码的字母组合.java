package 学习.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:02
 */
public class 电话号码的字母组合 {
    String[] init;
    List<String> res;
    StringBuilder[] stringBuilder;
    int n;
    public List<String> letterCombinations(String digits) {
        res = new ArrayList<>();
        if (digits.length() == 0) {
            return res;
        }
        n = digits.length();
        init = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        stringBuilder = new StringBuilder[n];
        for (int i = 0; i < digits.length(); i++) {
            stringBuilder[i] = new StringBuilder();
            stringBuilder[i].append(init[digits.charAt(i)-'0'-2]);
        }
        backTrack(0,new StringBuilder());
        return res;
    }
    public void backTrack(int i,StringBuilder temp) {
        if (i>=n) {
            res.add(temp.toString());
            return;
        }
        for (int j = 0; j < stringBuilder[i].length(); j++) {
            temp.append(stringBuilder[i].charAt(j));
            backTrack(i+1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
