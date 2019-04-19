/*
Given a singly-linked list, check whether its length is even or odd in a single pass. An Empty list has 0 nodes which makes the number of nodes in it even.

Examples:
1->2->3->4 == true
1->2->3->4->5 == false
*/

public Boolean isListEven(ListNode head) {
    if (head == null) return true;
    int count = 0;
    while (head != null) {
        count++;
        head = head.next;
    }
    return count%2 == 0;
}

// better solution
public Boolean isListEven(ListNode head) {
    if(head == null)
        return true;
    return !isListEven(head.next);
}
