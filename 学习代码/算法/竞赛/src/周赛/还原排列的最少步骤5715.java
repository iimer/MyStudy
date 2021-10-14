package 周赛;

import java.util.ArrayList;
import java.util.List;

public class 还原排列的最少步骤5715 {
	public int reinitializePermutation(int n) {
		List<Integer> perm = new ArrayList<Integer>();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			perm.add(i);
			arr.add(i);
		}
		boolean flag = false;
		int num = 0;
		while (!flag) {
			num++;
			flag = true;
			for (int i = 0; i < n; i++) {
				if (i%2==0) {
					arr.set(i, perm.get(i/2));
				}
				else {
					arr.set(i, perm.get(n / 2 + (i - 1) / 2));
				}
				
			}
			perm.clear();
			perm.addAll(arr);
			for (int i = 0; i < n; i++) {
				if (perm.get(i)!=i) {
					flag = false;
					break;
				}
			}
		}
		return num;
    }
}
