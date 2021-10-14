import java.util.HashSet;

/**
 * @author qgyiimer
 * @create 2021-{09}--14:44
 */
public class jz03数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])) {
                hashSet.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }
}
