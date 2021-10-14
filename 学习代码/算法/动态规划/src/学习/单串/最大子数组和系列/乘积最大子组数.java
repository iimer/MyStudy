package 学习.单串.最大子数组和系列;

import java.util.Arrays;

/**
 * @author qgyiimer
 * @create 2021-{04}--13:17
 */
public class 乘积最大子组数 {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{-2,3,-4}));
    }
    public static int maxProduct(int[] nums) {
//        int[] max = new int[nums.length];
        int[] maxNum = new int[nums.length];
        int[] minNum = new int[nums.length];
//        max[0] = nums[0];
        maxNum[0] = nums[0];
        minNum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
//                max[i] = Math.max(nums[i],nums[i]*minNum[i-1]);
                minNum[i] = Math.min(nums[i],nums[i]*maxNum[i-1]);
                maxNum[i] = Math.max(nums[i],nums[i]*minNum[i-1]);
            } else {
//                max[i] = Math.max(nums[i],nums[i]*maxNum[i-1]);
                minNum[i] = Math.min(nums[i],nums[i]*minNum[i-1]);
                maxNum[i] = Math.max(nums[i],nums[i]*maxNum[i-1]);
            }
        }
        Arrays.sort(maxNum);
        return maxNum[maxNum.length-1];
    }
}
