import java.util.Deque;
import java.util.LinkedList;

/**
 * @author qgyiimer
 * @create 2021-{09}--13:06
 */
public class jz30包含min函数的栈 {
    Deque<Integer> deque1 = new LinkedList<>();
    Deque<Integer> deque2 = new LinkedList<>();

    /** initialize your data structure here. */
    public jz30包含min函数的栈() {

    }

    public void push(int x) {
        deque1.addFirst(x);
        if (deque2.isEmpty() || deque2.peekFirst() >= x) {
            deque2.addFirst(x);
        }
    }

    public void pop() {
        if (deque1.removeFirst().equals(deque2.peekFirst())) {
            deque2.removeFirst();
        }
    }

    public int top() {
        return deque1.peekFirst();
    }

    public int min() {
        return deque2.peekFirst();
    }
}
