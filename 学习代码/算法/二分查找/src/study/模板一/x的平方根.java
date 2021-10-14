package study.模板一;

/**
 * @author qgyiimer
 * @create 2021-{07}--16:36
 */
public class x的平方根 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        int left = 0;
        int right = x;
        int mid = left + (right -left)/2;
        int midTemp;
        while (left<=right) {
            midTemp = x/mid;
            if (midTemp >= mid && x/(mid+1) < mid+1) {
                return mid;
            } else if (midTemp > mid) {
                left = mid+1;
            } else {
                right = mid-1;
            }
            mid = left + (right -left)/2;
        }
        return -1;
    }
}
