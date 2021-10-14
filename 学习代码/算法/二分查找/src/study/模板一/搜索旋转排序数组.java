package study.模板一;

/**
 * @author qgyiimer
 * @create 2021-{07}--17:18
 */
public class 搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        if (nums.length==1){
            if (nums[0] == target){
                return 0;
            } else {
                return -1;
            }
        }
        int left = 0;
        int right = nums.length-1;
        int mid = left + (right - left)/2;
        int point = 0;
        while (left <= right) {
            if (nums[mid]<nums[0] && nums[mid]<nums[mid-1]) {
                point = mid;
                break;
            } else if (nums[mid] < nums[0]) {
                right = mid -1;
            } else {
                left = mid+1;
            }
            mid = left + (right - left)/2;
        }
        if (target>=nums[0] && point != 0) {
            left = 0;
            right = point -1;
        } else {
            left = point;
            right = nums.length -1;
        }
        mid = left + (right - left)/2;
        while (left <= right) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid -1;
            } else {
                left = mid+1;
            }
            mid = left + (right - left)/2;
        }
        return -1;
    }
}
