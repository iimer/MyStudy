/**
 * @author qgyiimer
 * @create 2021-{09}--16:46
 */
public class jz25合并两个排序的链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head =null;
        if (l1.val>l2.val){
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        ListNode hNext = head;
        while (l1!=null) {
            if (l2 == null) {
                hNext.next = l1;
                return head;
            }
            if (l1.val<=l2.val) {
                hNext.next = l1;
                hNext = l1;
                l1 = l1.next;
            } else {
                hNext.next = l2;
                hNext = l2;
                l2 = l2.next;
            }
        }
        if (l2!=null) {
            hNext.next = l2;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
