package 学习.单串.变形两个位置;

import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{04}--14:17
 */
public class 最长等差数组 {
    public int longestArithSeqLength(int[] A) {
        int[][] dp = new int[A.length][A.length];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int max = 2;
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j <A.length ; j++) {
                int k = hashMap.getOrDefault(A[i]-A[j] + A[i],-1);
                if (k>=0 && k<i) {
                    dp[i][j] = dp[k][i]==0?3: dp[k][i]+ 1;
                    max = Math.max(dp[i][j],max);
                }
            }
            hashMap.put(A[i],i);
        }
        return max;
    }
}
