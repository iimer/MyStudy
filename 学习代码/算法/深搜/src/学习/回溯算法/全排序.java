package 学习.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--15:01
 */
public class 全排序 {
    List<List<Integer>> res;
    int n;
    int[] nums;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        n = nums.length;
        this.nums = nums;
        backTracking(list,0);
        return res;
    }
    public void backTracking(List<Integer> list,int i){
        if (i>=n) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!list.contains(nums[j])) {
                list.add(nums[j]);
                backTracking(list,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
