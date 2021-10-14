import java.util.HashMap;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--16:55
 */
public class jz35复杂链表的复制 {
    HashMap<Integer, List<Node>> cache = new HashMap<>();
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while (cur!=null) {
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        Node myHead = map.get(head);
        while (head!=null) {
            final Node pre = map.get(head);
            final Node node = map.get(head.next);
            final Node node1 = map.get(head.random);
            pre.next = node;
            pre.random = node1;
            head = head.next;
        }
        return myHead;
    }
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
