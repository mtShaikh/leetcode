/*
Given a singly-linked list, write a method to delete its last node and return the head. Example:

1->2->3->4 ==> 1->2->3
*/

public ListNode deleteAtTail(ListNode head) {
 if (head == null) return null;
    if (head.next == null) return null;
    ListNode curr = head;
    while(curr.next.next != null) {
        curr = curr.next;
    }
    curr.next = null;
    return head;


}
