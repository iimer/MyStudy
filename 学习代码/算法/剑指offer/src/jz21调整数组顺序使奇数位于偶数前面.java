/**
 * @author qgyiimer
 * @create 2021-{09}--16:25
 */
public class jz21调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return nums;
    }
}
