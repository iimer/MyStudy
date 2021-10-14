package 递归;

import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{04}--11:56
 */
public class 斐波那契数列 {
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    public int fib(int n) {
        if (hashMap.containsKey(n)){
            return hashMap.get(n);
        }
        int res;
        if (n < 2) {
            res = n;
        } else {
            res = fib(n-1) + fib(n-2);
        }
        hashMap.put(n,res);
        return res;
    }
}
