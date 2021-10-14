package base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LC_removeElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		System.out.println(new Lolution().removeElement(a, 1));
	}
}
class Lolution {
    public int removeElement(int[] nums, int val) {
    	IntStream stream = Arrays.stream(nums);
    	Stream<Integer> integerStream = stream.boxed();
    	Integer[] integers = integerStream.toArray(Integer[]::new);
    	List<Integer> list = new ArrayList<Integer>(Arrays.asList(integers));
    	list.remove(Integer.valueOf(val));
    	for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
    	System.out.println(Arrays.toString(nums));
    	return 0;
    }
}