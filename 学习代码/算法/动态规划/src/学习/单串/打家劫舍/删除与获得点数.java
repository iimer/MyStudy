package 学习.单串.打家劫舍;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author qgyiimer
 * @create 2021-{04}--10:27
 */
public class 删除与获得点数 {
    public static void main(String[] args) {
        System.out.println(deleteAndEarn(new int[]{3, 2, 3, 3, 3, 4}));
    }
    public static int deleteAndEarn(int[] nums) {
        LinkedHashMap<Integer,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                hashMap.put(nums[i],hashMap.get(nums[i])+nums[i]);
            } else{
                hashMap.put(nums[i],nums[i]);
            }
        }
        int[] newNums = new int[hashMap.size()];
        Set<Integer> integers = hashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        int j =0;
        while (iterator.hasNext()) {
            newNums[j++] = iterator.next();
        }
        Arrays.sort(newNums);
        int[] dp = new int[newNums.length+2];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            if (i==2 || newNums[i-2] - newNums[i-3] == 1) {
                dp[i] = Math.max(dp[i-2]+hashMap.get(newNums[i-2]),dp[i-1]);
            } else{
                dp[i] = dp[i-1]+hashMap.get(newNums[i-2]);
            }
        }
        return dp[dp.length-1];
    }
}
