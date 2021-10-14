import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author qgyiimer
 * @create 2021-{09}--11:13
 */
public class jz50第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        Deque<Character> deque = new LinkedList<>();
        HashMap<Character,Boolean> cache = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char r = s.charAt(i);
            if (!cache.containsKey(r)) {
                deque.addLast(r);
                cache.put(r,false);
            } else {
                if (!cache.get(r)) {
                    deque.remove(r);
                    cache.put(r,true);
                }
            }
        }
        if (deque.isEmpty()) {
            return ' ';
        } else {
            return deque.removeFirst();
        }
    }
}
