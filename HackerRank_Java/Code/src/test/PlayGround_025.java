package test;




public class PlayGround_025 {
	
	
	public static void main(String[] args) {
		ListNode myListNode = new ListNode(5);
		System.out.println(myListNode.val);
		System.out.println(myListNode.next);
		
		ListNode secListNode = myListNode;
		secListNode.val = 99999;
		System.out.println(secListNode.val);
		System.out.println(secListNode.next);
		System.out.println(myListNode.val);
		System.out.println(myListNode.next);
		
	}

}


class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		// TODO Auto-generated constructor stub
		val = x;
	}
}
