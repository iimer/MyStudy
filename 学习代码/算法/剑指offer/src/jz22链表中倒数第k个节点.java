/**
 * @author qgyiimer
 * @create 2021-{09}--16:30
 */
public class jz22链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for (int i = 0; i < k; i++) {
            former = former.next;
        }
        while (former!=null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
