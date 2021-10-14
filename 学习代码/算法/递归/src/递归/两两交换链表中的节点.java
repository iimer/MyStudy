package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--10:22
 */
public class 两两交换链表中的节点 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        swap(head);
        return newHead;
    }
    public void swap(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode node = head.next.next;
        head.next.next = head;
        if (node == null || node.next == null) {
            head.next = node;
        } else{
            head.next = node.next;
        }
        swap(node);
    }
}
