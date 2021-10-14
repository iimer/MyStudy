package 学习.单串.其他问题dpi;

/**
 * @author qgyiimer
 * @create 2021-{09}--10:33
 */
public class 等差数列划分 {
    public int numberOfArithmeticSlices(int[] A) {
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                dp = 1 + dp;
                sum += dp;
            } else{

                dp = 0;
            }
        }
        return sum;
    }
}
