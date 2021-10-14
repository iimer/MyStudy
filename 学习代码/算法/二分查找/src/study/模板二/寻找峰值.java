package study.模板二;

/**
 * @author qgyiimer
 * @create 2021-{07}--11:37
 */
public class 寻找峰值 {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left)/2;
            if (nums[mid] < nums[mid+1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
