import java.util.ArrayList;

/**
 * @author qgyiimer
 * @create 2021-{04}--21:41
 */
public class 寻找旋转排序数组中的最小值153 {
    public int findMin(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        int index = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]>nums[i+1]){
                index = i+1;
            }
        }
        return  nums[index];
    }
}
