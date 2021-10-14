/**
 * @author qgyiimer
 * @create 2021-{09}--11:34
 */
public class jz29顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int[] res = new int[matrix.length*matrix[0].length];
        int rIndex = 0;
        int i = 0;
        int j = 0;
        while (true) {
            while (j>=0&&j<= matrix[0].length-1 && !visited[i][j]) {
                visited[i][j] = true;
                res[rIndex++] = matrix[i][j];
                j++;
            }

            if (rIndex == matrix.length*matrix[0].length) {
                return res;
            }
            j--;
            i++;
            while (i>=0&&i<=matrix.length-1 && !visited[i][j]) {
                visited[i][j] = true;
                res[rIndex++] = matrix[i][j];
                i++;
            }

            if (rIndex == matrix.length*matrix[0].length) {
                return res;
            }
            i--;
            j--;
            while (j>=0&&j<= matrix[0].length-1 && !visited[i][j]) {
                visited[i][j] = true;
                res[rIndex++] = matrix[i][j];
                j--;
            }

            if (rIndex == matrix.length*matrix[0].length) {
                return res;
            }
            j++;
            i--;
            while (i>=0&&i<=matrix.length-1 && !visited[i][j]) {
                visited[i][j] = true;
                res[rIndex++] = matrix[i][j];
                i--;
            }
            if (rIndex == matrix.length*matrix[0].length) {
                return res;
            }
            i++;
            j++;
        }
    }

}
