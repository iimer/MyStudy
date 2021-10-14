package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--11:32
 */
public class 反转链表 {
    private class ListNode {
        ListNode next;
        int val;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head;
        while (newHead.next!=null) {
            newHead = newHead.next;
        }
        reverse(head,head.next);
        head.next = null;
        return newHead;
    }
    public void reverse(ListNode head,ListNode next) {
        if (next == null) {
            return;
        }
        ListNode newNext = next.next;
        next.next = head;
        head = next;
        reverse(head,newNext);
    }
}
