import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{09}--16:03
 */
public class jz10v1斐波那契数列 {
    public static void main(String[] args) {
        int s = (int) (1e9+7);
        System.out.println(s);
    }
    HashMap<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return  1;
        }
        int a=0,b=1,sum=0;
        for (int i = 2; i <= n; i++) {
            sum = (a+b)%(int) (1e9+7);
            a = b;
            b = sum;
        }
        return sum;
    }
}
