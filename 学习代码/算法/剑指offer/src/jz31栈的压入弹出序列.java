import java.util.*;

/**
 * @author qgyiimer
 * @create 2021-{09}--13:33
 */
public class jz31栈的压入弹出序列 {
    Deque<Integer> stack = new LinkedList<>();
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.addFirst(pushed[i]);
            while (!stack.isEmpty() && stack.peekFirst() == popped[k]) {
                stack.removeFirst();
                k++;
            }
        }
        return stack.isEmpty();
    }
}
