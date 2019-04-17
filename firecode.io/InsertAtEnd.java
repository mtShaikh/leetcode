/*
Write a method to insert a node at the end of a singly-linked list. Return the head of the modified list.

Examples:

LinkedList: 1->2 , Head = 1

InsertAtTail(Head,1) ==> 1->2->1
InsertAtTail(Head,2) ==> 1->2->2
InsertAtTail(Head,3) ==> 1->2->3
*/


public ListNode insertAtTail(ListNode head, int data) {
	 ListNode node = new ListNode(data);
    if (head == null) {
        head = node;
        return head;
    }
	ListNode current = head;
	while(current.next != null) {
	    current = current.next;
	}
    current.next = node;
    return head;
}
