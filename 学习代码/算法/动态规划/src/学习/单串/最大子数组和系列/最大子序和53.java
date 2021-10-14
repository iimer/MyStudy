package 学习.单串.最大子数组和系列;

/**
 * @author qgyiimer
 * @create 2021-{04}--12:48
 */
public class 最大子序和53 {
    public int maxSubArray(int[] nums) {
        int pre = 0,maxSum = nums[0];
        for (int num:nums) {
            pre = Math.max(num,pre+num);
            maxSum = Math.max(maxSum,pre);
        }
        return maxSum;
    }
}
