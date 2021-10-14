/**
 * @author qgyiimer
 * @create 2021-{09}--15:14
 */
public class jz15二进制中1的个数 {
    public int hammingWeight(int n) {
        if (n==Integer.MIN_VALUE){
            return 1;
        }
        int sum = 0;
        if (n<0) {
            n=-n;
            n-=1;
            while (n>0) {
                if (n%2 == 1) {
                    sum++;
                }
                n/=2;
            }
            return 32-sum;
        }
        while (n>0) {
            if (n%2 == 1) {
                sum++;
            }
            n/=2;
        }
        return sum;
    }
}
