package 递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--10:49
 */
public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sum = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        helper(sum,sub,numRows,1,1);
        return sum;
    }
    public void helper(List<List<Integer>> sum, List<Integer> sub, int rows, int i, int j) {
        if (i>rows) {
            return;
        }
        if ( i == j) {
            sub.add(1);
            sum.add(new ArrayList<>(sub));
            sub.clear();
            helper(sum,sub,rows,i+1,1);
        } else {
            if ( j ==1 ){
                sub.add(j);
            }else {
                sub.add(sum.get(i-2).get(j-3)+sum.get(i-2).get(j-2));
            }
            helper(sum,sub,rows,i,j+1);
        }
    }
}
