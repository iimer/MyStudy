/**
 * @author qgyiimer
 * @create 2021-{09}--22:19
 */
public class r7整数反转 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE*9);
    }
    public int reverse(int x) {
        int digit = 0;
        int res = 0;
        while (x != 0) {
            if (res < Integer.MIN_VALUE/10 || res > Integer.MAX_VALUE/10) {
                return 0;
            }
            digit = x%10;
            x/=10;
            res = res*10+digit;
        }
        if ((res>0&&x<0) || (res<0&&x>0)) {
            return 0;
        }
        return res;
    }
}
