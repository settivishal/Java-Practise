package Recursion;

//! Given a linked list, swap every two adjacent nodes and return its head.
//* We define the function to implement as swap(head), where the input parameter head refers to the head of a linked list. The function should return the head of the new linked list that has any adjacent nodes swapped.

//* Following the guidelines we lay out above, we can implement the function as follows:

//* First, we swap the first two nodes in the list, i.e. head and head.next;
//* Then, we call the function self as swap(head.next.next) to swap the rest of the list following the first two nodes.
//* Finally, we attach the returned head of the sub-list in step (2) with the two nodes swapped in step (1) to form a new linked list.


public class SwapNodesinPair {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode second = head.next;
        ListNode third = second.next;
        
        second.next = head;
        head.next = swapPairs(third);
        
        return second;
    }
}