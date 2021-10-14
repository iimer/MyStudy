import java.util.Arrays;

/**
 * @author qgyiimer
 * @create 2021-{09}--18:02
 */
public class jz61扑克牌中的顺子 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                sum++;
                System.out.println(sum);
                continue;
            }
            if (i!=0) {
                if (nums[i] == nums[i-1]) {
                    return false;
                }
                sum-=(nums[i]-nums[i-1]-1);
            }
        }
        return sum==0;
    }
}
