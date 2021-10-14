package study.模板二;

/**
 * @author qgyiimer
 * @create 2021-{07}--11:14
 */
public class 第一个错误的版本 {
    public int firstBadVersion(int n) {
        long left = 1;
        long right = (long) n+1;
        long mid=0;
        while (left < right) {
            mid = left+(right-left)/2;
            if (isBadVersion((int) mid)) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        if (right==(long) n+1) {
            return -1;
        }
        return (int) left;
    }

    public boolean isBadVersion(int version){
        return true;
    }
}
