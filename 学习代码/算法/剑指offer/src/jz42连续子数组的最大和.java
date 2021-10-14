/**
 * @author qgyiimer
 * @create 2021-{09}--15:05
 */
public class jz42连续子数组的最大和 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int pre = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (pre <= 0) {
                pre = nums[i];
            } else {
                pre = pre + nums[i];
            }
            max = Math.max(max,pre);
        }
        return max;
    }
}
