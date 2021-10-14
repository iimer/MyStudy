package 递归;

import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{04}--12:00
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(1);
    }
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    public int climbStairs(int n) {
        if (hashMap.containsKey(n)) {
            return hashMap.get(n);
        }
        int res;
        if (n<=2){
            res = n;
        }else {
            res = climbStairs(n - 1) + climbStairs(n - 2);
        }
        hashMap.put(n,res);
        return res;
    }
}
