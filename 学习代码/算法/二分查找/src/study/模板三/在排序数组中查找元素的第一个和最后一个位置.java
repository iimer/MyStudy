package study.模板三;

/**
 * @author qgyiimer
 * @create 2021-{07}--22:28
 */
public class 在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        int left = -1;
        int right = nums.length;
        int mid = left + (right - left)/2;
        while (left<right-1) {
            if (nums[mid]<=target) {
                left = mid;
            } else {
                right = mid;
            }
            mid = left + (right - left)/2;
        }
        if (left==-1 || nums[left]!=target) {
            return new int[]{-1,-1};
        }
        int resRight = right-1;
        left = -1;
        right = nums.length;
        mid = left + (right - left)/2;
        while (left<right-1) {
            if (nums[mid]<target) {
                left = mid;
            } else {
                right = mid;
            }
            mid = left + (right - left)/2;
        }
        int resLeft = left+1;
        return new int[]{resLeft,resRight};
    }
}
