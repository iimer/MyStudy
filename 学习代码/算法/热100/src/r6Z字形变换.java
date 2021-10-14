import java.util.Deque;
import java.util.LinkedList;

/**
 * @author qgyiimer
 * @create 2021-{09}--22:06
 */
public class r6Z字形变换 {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Deque<Character>[] deques = new LinkedList[numRows];
        for (int i = 0; i < numRows; i++) {
            deques[i] = new LinkedList<>();
        }
        int line = 1;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            deques[line-1].addLast(s.charAt(i));
            if (flag) {
                line++;
            } else {
                line--;
            }
            if (line == numRows || line == 1) {
                flag = !flag;
            }
        }
        StringBuilder res = new StringBuilder(s.length());
        for (int i = 0; i < numRows; i++) {
            while (!deques[i].isEmpty()) {
                res.append(deques[i].removeFirst());
            }
        }
        return res.toString();
    }
}
