package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--15:40
 */
public class 合并两个有序链表 {
    public class ListNode {
        int val;
        ListNode next;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 ==null) {
            return l1 == null ? l2 : l1;
        }
        ListNode head;
        if (l1.val <= l2.val){
            head = l1;
            merge(head,l1.next,l2);
        } else {
            head = l2;
            merge(head,l1,l2.next);
        }

        return head;
    }
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        else if (l2 == null) {
//            return l1;
//        }
//        else if (l1.val < l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        }
//        else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//
//    }
    public void merge(ListNode head, ListNode l1,ListNode l2) {
        if (l1!=null && l2 !=null) {
            if (l1.val >= l2.val) {
                head.next = l2;
                merge(head.next,l1,l2.next);
            } else {
                head.next = l1;
                merge(head.next,l1.next,l2);
            }
        } else{
            head.next = l1==null?l2:l1;
            return;
        }
    }
}
