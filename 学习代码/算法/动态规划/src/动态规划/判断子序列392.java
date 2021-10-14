package 动态规划;

public class 判断子序列392 {
	public boolean isSubsequence(String s, String t) {
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			boolean flag = false;
			while(!flag&&j<t.length()) {
				if (s.charAt(i) == t.charAt(j)) {
					flag=true;
				}
				j++;
			}
			if (!flag) {
				return false;
			}
		}
		return true;
    }
	
}
