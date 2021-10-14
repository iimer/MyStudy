package 学习.单串.最经典单串LIS系列;

import java.util.Arrays;

/**
 * @author qgyiimer
 * @create 2021-{04}--13:22
 */
public class 最长上升子序列300 {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] len = new int[nums.length];
        Arrays.fill(len,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1;j>=0;j--) {
                if (nums[i] > nums[j]) {
                    len[i] = Math.max(len[j] + 1,len[i]);
                }
            }
        }
        Arrays.sort(len);
        return len[len.length-1];
    }
}
