package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--21:13
 */
public class 反转字符串
{
    public void reverseString(char[] s) {
        int i = 0;
        reverse(s,i);
    }
    void reverse(char[] s,int i){
        int len = s.length;
        if(i >= len/2){
            return;
        }
        char temp = s[i];
        s[i] = s[len - i -1];
        s[len - i - 1] = temp;
        reverse(s,i + 1);
    }
}
