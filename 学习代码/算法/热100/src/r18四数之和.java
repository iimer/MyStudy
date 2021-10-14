import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--11:00
 */

public class r18四数之和 {

    {
        i = 2;
    }
    int i = 0;
    public r18四数之和() {

    }
public static int test() {
        int a = 5;
    try {
        a = 10;
        return a;
    }finally {
        System.out.println("bbb");
        a=40;
    }
}

    public static void main(String[] args) throws Exception {
        System.out.println(1>>>3);
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            for (int j = i+1; j < nums.length; j++) {
                if (j>i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int lef = j+1;
                int rig = len-1;
                while (lef<rig) {
                    if (lef!=j+1 && nums[lef] == nums[lef-1]) {
                        lef++;
                        continue;
                    }
                    if (nums[i]+nums[j] + nums[lef] + nums[rig] > target) {
                        rig--;
                    } else if (nums[i]+nums[j] + nums[lef] + nums[rig] < target) {
                        lef++;
                    } else {
                        List<Integer> ress = new LinkedList<>();
                        ress.add(nums[i]);
                        ress.add(nums[j]);
                        ress.add(nums[lef]);
                        ress.add(nums[rig]);
                        res.add(ress);
                        lef++;
                        rig--;
                    }
                }
            }
        }
        return res;
    }
}
