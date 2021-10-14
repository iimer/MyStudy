package 学习.回溯算法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--15:11
 */
public class 数独 {
    int n;
    List<Character>[] cols;
    List<Character>[] rows;
    List<Character>[] modules;
    char[][] board;
    public void solveSudoku(char[][] board) {
        n = board.length;
        this.board = board;
        cols = new ArrayList[n];
        rows = new ArrayList[n];
        modules = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            cols[i] = new ArrayList<>();
            rows[i] = new ArrayList<>();
            modules[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char temp = board[i][j];
                if (temp != '.') {
                    cols[j].add(temp);
                    rows[i].add(temp);
                    modules[i/3*3+j/3].add(temp);
                }
            }
        }
        backTracking(0,0);
    }
    public boolean backTracking(int i,int j) {
        if (i>8||j>8) {
            return true;
        }
        if (board[i][j] == '.') {
            for (char k = '1'; k <= '9'; k++) {
                if (!cols[j].contains(k)&&!rows[i].contains(k)&&!modules[i/3*3+j/3].contains(k)) {
                    cols[j].add(k);
                    rows[i].add(k);
                    modules[i/3*3+j/3].add(k);
                    board[i][j] = k;
                    if (!backTracking(j==8?i+1:i,j==8?0:j+1))
                    {
                        cols[j].remove(cols[j].size()-1);
                        rows[i].remove(rows[i].size()-1);
                        modules[i/3*3+j/3].remove(modules[i/3*3+j/3].size()-1);
                        board[i][j] = '.';
                    } else {
                        return true;
                    }
                }
            }
        } else {
            return backTracking(j==8?i+1:i,j==8?0:j+1);
        }
        return false;
    }
}
