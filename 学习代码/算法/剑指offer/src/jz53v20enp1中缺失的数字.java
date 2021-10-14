/**
 * @author qgyiimer
 * @create 2021-{09}--13:54
 */
public class jz53v20enp1中缺失的数字 {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        while (left<=right) {
            int middle = left + (right - left)/2;
            if (nums[middle] == middle) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return left;
    }
}
