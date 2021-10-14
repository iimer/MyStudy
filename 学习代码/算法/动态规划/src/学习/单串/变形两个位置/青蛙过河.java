package 学习.单串.变形两个位置;

import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{04}--17:02
 */
public class 青蛙过河 {
    boolean flag;
    HashMap<Integer,Integer> hashMap;
    int n;
    int[] stones;
    public boolean canCross(int[] stones) {
        if (stones[1]!=1) {
            return false;
        }
        flag = false;
        this.stones = stones;
        this.n = stones.length;
        hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(stones[i],i);
        }
        dfs(1,1);
        return flag;
    }
    public void dfs(int k,int i) {
        if (i==n-1) {
            flag = true;
            return;
        }
        if (!flag){
            if (k-1!=0&&hashMap.containsKey(stones[i]+k-1)){
                dfs(k-1,hashMap.get(stones[i]+k-1));
            }
            if (hashMap.containsKey(stones[i]+k)){
                dfs(k,hashMap.get(stones[i]+k));
            }
            if (hashMap.containsKey(stones[i]+k+1)){
                dfs(k+1,hashMap.get(stones[i]+k+1));
            }
        }
    }
}
