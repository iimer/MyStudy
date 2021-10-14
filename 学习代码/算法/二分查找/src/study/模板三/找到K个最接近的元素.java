package study.模板三;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{07}--21:49
 */
public class 找到K个最接近的元素 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList();
        int left = 0 , right = arr.length-k-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(x-arr[mid]<=arr[mid+k]-x){
                right=mid;
            }else{
                left=mid+1;
            }
        }

        for(int i = left ; i < left+k ; i++){
            res.add(arr[i]);
        }
        return res;
    }
}
