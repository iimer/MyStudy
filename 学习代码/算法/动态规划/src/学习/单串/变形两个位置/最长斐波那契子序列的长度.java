package 学习.单串.变形两个位置;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qgyiimer
 * @create 2021-{04}--11:32
 */
public class 最长斐波那契子序列的长度 {
    public int lenLongestFibSubseq(int[] arr) {
        int[][] dp =  new int[arr.length][arr.length];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i],1);
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int k = map.getOrDefault(arr[j] - arr[i],-1);
                if (k>=0 && k<i) {
                    dp[i][j] = dp[k][i]+2;
                    max = Math.max(dp[i][j],max);
                }
            }
        }
        return max;
    }
}
