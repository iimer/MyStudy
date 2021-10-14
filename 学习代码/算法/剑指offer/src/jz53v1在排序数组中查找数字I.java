/**
 * @author qgyiimer
 * @create 2021-{09}--13:44
 */
public class jz53v1在排序数组中查找数字I {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int tar = -1;
        while (left<=right) {
            int middle = left+(right - left)/2;
            if (nums[middle] == target) {
                tar = middle;
                break;
            } else if (nums[middle] >target) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        if (tar == -1) {
            return 0;
        } else {
            int sum = 1;
            int tarL = tar-1;
            int tarR = tar+1;
            while (tarL >= 0 && nums[tarL]==target) {
                sum++;
                tarL--;
            }
            while (tarR<=nums.length-1 && nums[tarR]==target) {
                sum++;
                tarR++;
            }
            return sum;
        }
    }
}
