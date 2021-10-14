/**
 * @author qgyiimer
 * @create 2021-{09}--9:51
 */
public class r11盛最多水的容器 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while (i<j) {
            max = height[i]<height[j]?Math.max(max,(j-i)*height[i++]):
                    Math.max(max,(j-i)*height[j--]);
        }
        return max;
    }
}
