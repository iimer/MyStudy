import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--15:23
 */
public class jz57v2和为s的连续正数序列 {
    public int[][] findContinuousSequence(int target) {
        int left = 1;
        int right = 1;
        int sum = 0;
        List<int[]> res = new LinkedList<>();
        while (left<=target/2) {
            if (sum<target) {
                sum+=right;
                right++;
            } else if (sum>target) {
                sum-=left;
                left++;
            } else {
                int[] ress = new int[right-left];
                int k = 0;
                for (int i = left; i < right; i++) {
                    ress[k++] = i;
                }
                res.add(ress);
                sum-=left;
                left++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
