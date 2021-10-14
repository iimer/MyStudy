/**
 * @author qgyiimer
 * @create 2021-{09}--13:25
 */
public class jz52两个链表的第一个公共节点 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
        ListNode second = headB;
        int count = 0;
        while (first != second) {
            if (first==null) {
                if (count == 2) {
                    return null;
                }
                first = headB;
                count++;
            } else {
                first = first.next;
            }
            if (second == null) {
                if (count == 2) {
                    return null;
                }
                second = headA;
                count++;
            } else {
                second = second.next;
            }
        }
        return first;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
   }
}
