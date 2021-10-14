/**
 * @author qgyiimer
 * @create 2021-{09}--15:58
 */
public class jz20表示数值的字符串 {
    public boolean isNumber(String s) {
        int i = 0;
        boolean res = false;
        while (i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        if (i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')) {
            i++;
        }
        while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
            res = true;
            i++;
        }
        if (i<s.length() && s.charAt(i)=='.') {
            i++;
            while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
                res = true;
                i++;
            }
        }
        if (!res) {
            return false;
        }
        if (i<s.length() && (s.charAt(i)=='e' || s.charAt(i)=='E')) {
            res = false;
            i++;
            if (i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')) {
                i++;
            }
            while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9') {
                res=true;
                i++;
            }
        }
        while (i<s.length() && s.charAt(i) == ' ') {
            i++;
        }
        if (i>=s.length() && res) {
            return true;
        }
        return false;
    }
}
/*
数值（按顺序）可以分成以下几个部分：

        若干空格
        一个 小数 或者 整数
        （可选）一个 'e' 或 'E' ，后面跟着一个 整数
        若干空格
        小数（按顺序）可以分成以下几个部分：

        （可选）一个符号字符（'+' 或 '-'）
        下述格式之一：
        至少一位数字，后面跟着一个点 '.'
        至少一位数字，后面跟着一个点 '.' ，后面再跟着至少一位数字
        一个点 '.' ，后面跟着至少一位数字
        整数（按顺序）可以分成以下几个部分：

        （可选）一个符号字符（'+' 或 '-'）
        至少一位数字*/
