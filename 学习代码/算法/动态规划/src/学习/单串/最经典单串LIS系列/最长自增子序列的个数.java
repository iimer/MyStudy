package 学习.单串.最经典单串LIS系列;

import java.util.Arrays;

/**
 * @author qgyiimer
 * @create 2021-{04}--13:55
 */
public class 最长自增子序列的个数 {
    public static void main(String[] args) {
        System.out.println(findNumberOfLIS(new int[]{1,1,1,2,2,2,3,3,3}));
    }
    public static int findNumberOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] len = new int[nums.length];
        int[] counts = new int[nums.length];
        Arrays.fill(len,1);
        Arrays.fill(counts,1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    if (len[j]+1>len[i]) {
                        counts[i] =counts[j];
                    }
                    if (len[j]+1 == len[i]) {
                        counts[i]+=counts[j];
                    }
                    len[i] = Math.max(len[i],len[j]+1);
                }
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < len.length; i++) {
            if (len[i]>len[maxIndex]){
                maxIndex = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < len.length; i++) {
            if (len[i]==len[maxIndex]){
                sum+=counts[i];
            }
        }
        return sum;
    }
}
