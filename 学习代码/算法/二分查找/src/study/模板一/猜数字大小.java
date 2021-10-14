package study.模板一;

/**
 * @author qgyiimer
 * @create 2021-{07}--17:00
 */
public class 猜数字大小 {
    public int guessNumber(int n) {

        int left = 1;
        int right = n;
        int mid = left + (right -left)/2;
        while (left<=right) {
            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == -1) {
                right = mid-1;
            } else {
                left = mid+1;
            }
            mid = left + (right -left)/2;
        }
        return -1;
    }
    int guess(int num){
        return 1;
    }
}
