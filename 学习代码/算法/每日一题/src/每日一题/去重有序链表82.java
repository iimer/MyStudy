package 每日一题;

public class 去重有序链表82 {

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
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		int temp = head.val;
		boolean flag;
		while(true) {
			flag = true;
			while(head.next != null && temp == head.next.val) {
				flag = false;
				head = head.next;
			}
			if (flag) {
				break;
			} else {
                head = head.next;
            }
			if (head == null) {
				return null;
			}
			temp = head.val;
		}
		
		ListNode headd = head;
		ListNode nextNode = head.next;
		if (nextNode == null) {
			return head;
		}
		while(true) {
			flag = true;
			temp = nextNode.val;
			while (nextNode.next!=null&&temp == nextNode.next.val) {
				flag =false;
				nextNode = nextNode.next;
			}
			if (flag) {
				headd.next = nextNode;
				headd = nextNode;
                nextNode = nextNode.next;
			} else {
                nextNode = nextNode.next;
            }
			if (nextNode == null) {
				headd.next = null;
				break;
			}
		}
		return head;
    }
}
