package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--14:04
 */
public class Pow {

    public double myPow(double x, int n) {
        return n>=0?pow(x,n) : 1.0/pow(x,-n);
    }
    public double pow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double y = pow(x, n / 2);
        return n%2 == 1? y*y*x : y*y;
    }
}
