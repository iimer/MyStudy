import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--15:33
 */
public class three {
    public int electricCarPlan(int[][] paths, int cnt, int start, int end, int[] charge) {
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> list2 = new ArrayList<>();
        List<List<Integer>> list3 = new ArrayList<>();
        for (int i = 0; i < paths.length; i++) {
            if (!list1.contains(paths[i][0])) {
                list1.add(paths[i][0]);
                List<Integer> list = new ArrayList<>();
                list.add(paths[i][1]);
                list2.add((new ArrayList<>(list)));
                list.clear();
                list.add(paths[i][2]);
                list3.add(new ArrayList<>(list));
            } else {
                list2.get(list1.indexOf(paths[i][0])).add(paths[i][1]);
                list3.get(list1.indexOf(paths[i][0])).add(paths[i][2]);
            }
        }

        return 0;
    }
    int min = Integer.MAX_VALUE;
    public void dfs (List<Integer> list1,List<List<Integer>> list2,List<List<Integer>> list3,
                     int start, int end, int[] charge){}
}
