import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:10
 */
public class 计算各位数字都不同的数字的个数357 {

    @Test
    public void test(){
        int sum = countNumbersWithUniqueDigits(4);
        System.out.println(sum);
    }
    int sum = 0;
    public int countNumbersWithUniqueDigits(int n) {
        if (n==0) {
            return 1;
        }
        if (n==1) {
            return 10;
        }
        List<Integer> item = new ArrayList<Integer>();
        int nums[] = new int[10];
        for (int i = 0; i < 10; i++) {
            nums[i] = i;
        }
        backTracking(item,nums,0,n);
        return sum+1;
    }
    public void backTracking(List<Integer> item, int nums[], int i,int n) {
        if (i >= n)  {
            return;
        }
        for (int j=0;j<nums.length;j++) {
            if (item.contains(nums[j])){
                continue;
            }
            if (j==0 && item.size()==0) {
                continue;
            }
            item.add(nums[j]);
            sum++;
            backTracking(item, nums, i+1,n);
            item.remove(item.size() - 1);
        }
    }
//    int sum = 0;
//    public int countNumbersWithUniqueDigits(int n) {
//        if (n==0) {
//            return 1;
//        }
//        if (n==1) {
//            return 10;
//        }
//        List<Integer> item = new ArrayList<Integer>();
//        int nums[] = new int[10];
//        for (int i = 0; i < 10; i++) {
//            nums[i] = i;
//        }
//        backTracking(item,nums,0,n);
//        return sum+1;
//    }
//    public void backTracking(List<Integer> item, int nums[], int i,int n) {
//        if (i >= n)  {
//            return;
//        }
//        List<Integer> list = new ArrayList<>(item);
//        for (int j=0;j<nums.length;j++) {
//            List<Integer> list1 = new ArrayList<>(list);
//            if (list1.contains(nums[j])){
//                continue;
//            }
//            if (j==0 && list1.size()==0) {
//                continue;
//            }
//            list1.add(nums[j]);
//            sum++;
//            backTracking(list1, nums, i+1,n);
////            item.remove(item.size() - 1);
//        }
//    }
}