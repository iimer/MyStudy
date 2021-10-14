package 学习.单串.最经典单串LIS系列;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author qgyiimer
 * @create 2021-{04}--12:48
 */
public class 俄罗斯套娃信封问题 {
    public static void main(String[] args) {
        System.out.println(maxEnvelopes(new int[][]{{4, 5}, {4, 6}, {6, 7}, {2, 3}, {1, 1}}));
    }
    public static int maxEnvelopes(int[][] envelopes) {
        int[] nums = new int[envelopes.length];
        Arrays.fill(nums,1);
        Arrays.sort(envelopes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else  {
                    return o1[0] - o2[0];
                }
            }
        });
        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0]>envelopes[j][0]
                && envelopes[i][1]>envelopes[j][1]){
                    nums[i] = Math.max(nums[i],nums[j]+1);
                }
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
