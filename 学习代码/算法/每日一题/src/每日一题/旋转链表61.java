package 每日一题;

public class 旋转链表61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
	public ListNode rotateRight(ListNode head, int k) {
		
		if (head == null || head.next==null) {
			return head;
		}
		if (k==0) {
			return head;
		}
		int sum = 1;
		ListNode headd = head;
		while (headd.next!=null) {
			sum++;
			headd = headd.next;
		}
		if(k%sum == 0) {
            return head;
        }
		int no = sum-k%sum;
		headd = head;
		ListNode headdd = head;
		//第no个是头结点的前一个
		for (int i = 0; i < no-1; i++) {
			headd = headd.next;
		}
		head = headd.next;
		headd.next = null;
		headd = head;
		while (headd.next!=null) {
			headd = headd.next;
		}
		headd.next = headdd;
		return head;
    }
}
