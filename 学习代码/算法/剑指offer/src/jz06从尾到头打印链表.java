import java.util.Deque;
import java.util.LinkedList;

/**
 * @author qgyiimer
 * @create 2021-{09}--15:27
 */
public class jz06从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        Deque<ListNode> deque = new LinkedList<>();
        int length = 0;
        while (head != null) {
            deque.addFirst(head);
            head = head.next;
            length++;
        }
        int[] res = new int[length];
        int i = 0;
        while (!deque.isEmpty()) {
            res[i++] = deque.remove().val;
        }
        return res;
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
