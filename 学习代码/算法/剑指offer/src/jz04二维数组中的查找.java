/**
 * @author qgyiimer
 * @create 2021-{09}--14:56
 */
public class jz04二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        final int n = matrix.length;
        if (n==0) {
            return false;
        }
        final int m = matrix[0].length;
        int left = 0;
        int right = m-1;
        while (left<=right){
            int middle = left + (right - left)/2;
            if (matrix[0][middle] == target) {
                return true;
            } else if (matrix[0][middle] > target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        int length = left;
        for (int i = 0; i < length; i++) {
            left = 0;
            right = n - 1;
            while (left<=right) {
                int middle = left + (right - left)/2;
                if (matrix[middle][i] == target) {
                    return true;
                } else if (matrix[middle][i] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return false;
    }
}
