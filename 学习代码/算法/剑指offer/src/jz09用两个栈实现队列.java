import java.util.Deque;
import java.util.LinkedList;

/**
 * @author qgyiimer
 * @create 2021-{09}--15:46
 */
public class jz09用两个栈实现队列 {
    private Deque<Integer> stack1 = new LinkedList<>();
    private Deque<Integer> stack2 = new LinkedList<>();

    public jz09用两个栈实现队列() {

    }

    public void appendTail(int value) {
        this.stack1.addFirst(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {

            while (!this.stack1.isEmpty()) {
                this.stack2.addFirst(this.stack1.remove());
            }
        }
        return stack2.isEmpty()?-1:this.stack2.remove();
    }
}
