package 学习.单串.打家劫舍;

/**
 * @author qgyiimer
 * @create 2021-{04}--10:10
 */
public class 打家劫舍II {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int[] dp1 = new int[nums.length];
        dp1[0] = nums[0];
        dp1[1] = Math.max(nums[0],nums[1]);
        int[] dp2 = new int[nums.length];
        dp2[0] = nums[1];
        dp2[1] = Math.max(nums[1],nums[2]);
        for (int i = 2; i < nums.length-1; i++) {
            dp1[i] = Math.max(dp1[i-2]+nums[i],dp1[i-1]);
            dp2[i] = Math.max(dp2[i-2]+nums[i+1],dp2[i-1]);
        }
        return Math.max(dp1[nums.length-2],dp2[nums.length-2]);
    }
}
