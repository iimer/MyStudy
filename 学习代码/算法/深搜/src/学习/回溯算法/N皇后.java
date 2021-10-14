package 学习.回溯算法;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--14:18
 */
public class N皇后 {
    int n;
    boolean[] col;
    boolean[] main;
    boolean[] sub;
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        col = new boolean[n];
        main = new boolean[2*n-1];
        sub = new boolean[2*n-1];
        res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        backTracking(0,path);
        return res;
    }
    public void backTracking(int i,Deque<Integer> path) {
        if (i>=n) {
            List<String> list = getString(path);
            res.add(list);
            return;
        }
        for (int j = 0; j < n; j++) {
            if (!col[j]&&!main[i-j+n-1]&&!sub[i+j]) {
                col[j] = true;
                main[i-j+n-1] = true;
                sub[i+j] = true;
                path.add(j);
                backTracking(i+1,path);
                col[j] = false;
                main[i-j+n-1] = false;
                sub[i+j] = false;
                path.removeLast();
            }
        }
    }
    public List<String> getString(Deque<Integer> path) {
        List<String> list = new ArrayList<>();
        for (Integer i: path) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                stringBuilder.append(".");
            }
            stringBuilder.setCharAt(i,'Q');
            list.add(stringBuilder.toString());
        }
        return list;
    }
}
