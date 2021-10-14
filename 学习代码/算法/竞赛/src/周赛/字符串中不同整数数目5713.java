package 周赛;

import java.util.ArrayList;
import java.util.List;

public class 字符串中不同整数数目5713 {
	public int numDifferentIntegers(String word) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < word.length(); ) {
			StringBuilder stringBuilder = new StringBuilder();
			boolean flag1 = false;
			boolean flag2 = false;
			while (i<word.length()&& (word.charAt(i)<'0' || word.charAt(i)>'9')) {
				i++;
			}
			while (i<word.length()&&(word.charAt(i)>='0' && word.charAt(i)<='9')) {
				if (word.charAt(i)!='0') {
					flag1 = true;
				}
				if (word.charAt(i)=='0') {
					flag2 = true;
				}
				if (word.charAt(i) == '0' && !flag1) {
					i++;
					continue;
				}else {
					stringBuilder.append(word.charAt(i));
				}
				i++;
			}
			if (flag2 &&!flag1) {
				stringBuilder.append('0');
			}
			if (list.indexOf(stringBuilder.toString())!=-1||stringBuilder.toString().equals("")) {
				continue;
			}else {
				list.add(stringBuilder.toString());
			}
		}
		return list.size();
    }
}
