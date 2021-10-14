/**
 * @author qgyiimer
 * @create 2021-{09}--17:38
 */
public class jz12矩阵中的路径 {
    public static void main(String[] args) {
        char[][] board= {{'a','a'}};
        String word = "aa";
        System.out.println(exist(board, word));
    }
    static char[][] board;
    static String word;
    static int index = 0;
    static int[][] des = {{-1,0},{1,0},{0,-1},{0,1}};
    static boolean[][] visited;
    public static boolean exist(char[][] board, String word) {
        if (board.length == 0){
            return false;
        }
        if (board.length == 1&&board[0].length == 1&&word.length()==1&&word.charAt(0)==board[0][0]) {
            return true;
        }
        jz12矩阵中的路径.board = board;
        jz12矩阵中的路径.word = word;
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backTracking(i,j)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean backTracking(int m,int n){
        if (index == word.length()) {
            return true;
        }
        if (board[m][n] == word.charAt(index)) {
            index++;
            visited[m][n] = true;
            for (int i = 0; i < 4; i++) {
                int x = m+des[i][0];
                int y = n+des[i][1];
                if (isGood(x,y) && !visited[x][y]) {
                    if (backTracking(x,y)) {
                        return true;
                    }
                }
            }
            if (index == word.length()) {
                return true;
            }
            visited[m][n] = false;
            index--;
        }
        return false;
    }
    public static boolean isGood(int x,int y) {
        if (x>=0&&x<=board.length-1&&y>=0&&y<=board[0].length-1){
            return true;
        } else {
            return false;
        }
    }
}
