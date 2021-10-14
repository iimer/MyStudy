/**
 * @author qgyiimer
 * @create 2021-{09}--16:30
 */
public class jz11旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right) {
            int middle = left + (right-left)/2;
            if (numbers[middle] > numbers[right]) {
                left = middle+1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle;
            } else {
                right--;
            }
        }
        return numbers[right];
    }
}
