import java.util.HashMap;

/**
 * @author qgyiimer
 * @create 2021-{09}--14:29
 */
public class jz39数组中出现次数超过一半的数字 {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int majorityElement(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    map.put(nums[i],map.get(nums[i])+1);
                } else {
                    map.put(nums[i],1);
                }
                if (map.get(nums[i]) > nums.length/2) {
                    return nums[i];
                }
        }
        return 0;
    }
}
