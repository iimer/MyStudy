package 周赛;

import java.util.ArrayList;
import java.util.List;

public class 替换字符串中括号内容5714 {
	public String evaluate(String s, List<List<String>> knowledge) {
		List<String> keys= new ArrayList<String>();
		List<String> values = new ArrayList<String>();
		for (int i = 0; i < knowledge.size(); i++) {
			keys.add(knowledge.get(i).get(0));
			values.add(knowledge.get(i).get(1));
		}
		StringBuilder newS = new StringBuilder();
		List<String> keysIn= new ArrayList<String>();
		List<String> valuesIn = new ArrayList<String>();
		for (int i = 0; i < s.length(); ) {
			if (s.charAt(i) == '(') {
				i++;
				StringBuilder sss = new StringBuilder();
				while (s.charAt(i)!=')') {
					sss.append(s.charAt(i));
					i++;
				}
				int index2 = keysIn.indexOf(sss.toString());
				if (index2!=-1) {
					newS.append(valuesIn.get(index2));
				} else {
					int index = keys.indexOf(sss.toString());
					if (index!=-1) {
						newS.append(values.get(index));
						keysIn.add(keys.get(index));
						valuesIn.add(values.get(index));
					} else {
						newS.append('?');
					}
				}
				i++;
			} else {
				newS.append(s.charAt(i));
				i++;
			}
			
		}
		return newS.toString();
    }
}
