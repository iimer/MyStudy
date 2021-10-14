package 递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--11:13
 */
public class 杨辉三角II {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            list.add(helper(rowIndex+1,i+1));
        }
        return list;
    }
    public int helper(int i, int j) {
        if (i == 1 || j == 1 || i == j) {
            return 1;
        }
        return helper(i-1,j)+helper(i-1,j-1);
    }
}
