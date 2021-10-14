package study;

/**
 * @author qgyiimer
 * @create 2021-{07}--15:27
 */
public class 二分查找 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        if (nums.length == 0){
            return -1;
        }
        if (nums[left] == target) {
            return left;
        }
        if (left == right) {
            return -1;
        }
        if (nums[right] ==target) {
            return right;
        }
        int mid = (left+right)/2;
        while (left+1 != right){
            if (nums[mid]==target) {
                return mid;
            } else if (nums[mid]>target) {
                right = mid;
                mid = (left+right)/2;
            } else {
                left = mid;
                mid = (left+right)/2;
            }
        }
        return -1;
    }
}
