/**
 * @author qgyiimer
 * @create 2021-{09}--15:14
 */
public class jz44数字序列中某一位的数字 {
    public int findNthDigit(int n) {
        int w = 1;
        long r = 9;
        long mw = 9;
        while (n>mw) {
            n-=mw;
            r*=10;
            w++;
            mw = r*w;
        }
        int num2 = n%w;
        int num1 = n/w + 1;
        if (num2 == 0) {
            num1 = n/w;
        }
        int resNum = (int) Math.pow(10,w-1) + num1-1;
        String res = String.valueOf(resNum);
        if (num2 == 0) {
            return Integer.parseInt(String.valueOf(res.charAt(res.length()-1)));
        } else {
            return Integer.parseInt(String.valueOf(res.charAt(num2-1)));
        }
    }
}
