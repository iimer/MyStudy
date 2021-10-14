/**
 * @author qgyiimer
 * @create 2021-{09}--16:40
 */
public class jz24反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode next = head.next;
        ListNode temp = next;
        head.next = null;
        ListNode pre = head;
        while (next != null) {
            temp = next.next;
            next.next = pre;
            pre = next;
            next = temp;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
