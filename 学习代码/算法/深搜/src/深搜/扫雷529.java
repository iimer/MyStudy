package 深搜;

public class 扫雷529 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board;
	}
	int[][] a = {{-1,-1},{0,-1},{1,-1},{-1,0},{1,0},{-1,1},{0,1},{1,1}};
	int maxIndex;
	
	public char[][] updateBoard(char[][] board, int[] click) {
		if (board[click[0]][click[1]] == 'M') {
			board[click[0]][click[1]] = 'X';
			return board;
		}
		maxIndex = board[0].length-1;
		dfs(board,click[0],click[1]);
		return board;
    }
//	不要让传进去的参数一直变化
	public void dfs(char[][] board,int x,int y) {
		int num = 0;
		int tx,ty;
		for (int i = 0; i < a.length; i++) {
            tx = x+a[i][0];
            ty = y+a[i][1];
			if (tx <=board.length-1 && ty<=maxIndex && 
						tx>=0 && ty>=0 && board[tx][ty]!='B') {
				if (board[tx][ty] == 'M') {
					num++;
				}
			}
		}
		if (num==0) {
            board[x][y]='B';
			for (int i = 0; i < a.length; i++) {
                tx = x+a[i][0];
				ty = y+a[i][1];
				if (tx <=board.length-1 && ty<=maxIndex && 
						tx>=0 && ty>=0 && board[tx][ty]!='B') {
					dfs(board, tx,ty);
				}
			}
		} else {
			board[x][y] = (char)(num + '0');
		}
	}
}
