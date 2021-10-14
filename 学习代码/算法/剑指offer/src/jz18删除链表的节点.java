/**
 * @author qgyiimer
 * @create 2021-{09}--15:49
 */
public class jz18删除链表的节点 {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode next = head.next;
        if (head.val == val) {
            head.next=null;
            return next;
        }
        ListNode pre = head;
        while (next!=null) {
            if (next.val==val) {
                pre.next = next.next;
                next.next = null;
                break;
            }
            pre = next;
            next = next.next;
        }
        return head;
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
