import java.util.Arrays;

/**
 * @author qgyiimer
 * @create 2021-{09}--15:50
 */
public class jz45把数组排成最小的数 {
    public String minNumber(int[] nums) {
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strings,(x,y)-> (x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
