package base;

import java.util.Arrays;

public class LC_moveZero {
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {0,1,0,3,12};
		System.out.println(Arrays.toString(nums));
		solution.moveZeroes(nums);
	}
}
class Solution {
    public void moveZeroes(int[] nums) {
    	int sum = 0;
    	int k = 0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				sum++;
			} else {
				nums[k++] = nums[i];
			}
		}
    	for (int i = 0; i < sum; i++) {
			nums[k++] = 0;
		}
    	System.out.println(Arrays.toString(nums).replace(" ", ""));
    }
}
