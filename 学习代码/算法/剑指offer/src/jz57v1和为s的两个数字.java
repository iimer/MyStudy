/**
 * @author qgyiimer
 * @create 2021-{09}--15:03
 */
public class jz57v1和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i<j) {
            int num = nums[i] + nums[j];
            if (num > target) {
                j--;
            } else if (num < target) {
                i++;
            } else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
