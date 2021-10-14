package 学习.单串.打家劫舍;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:00
 */
public class 打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            max[i] = Math.max(max[i-2]+nums[i],max[i-1]);
        }
//        Arrays.sort(max);
        return max[max.length-1];
    }
}
