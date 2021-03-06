package LinkedList.Singly;

//! Iterative Method 
//! O(n)

//* Initialize three pointers prev as NULL, curr as head and next as NULL.
//* Iterate through the linked list. In loop, do following. 
//* Before changing next of current, 
//* store next node 
//* next = curr->next
//* Now change next of current 
//* This is where actual reversing happens 
//* curr->next = prev 
//* Move prev and curr one step forward 
//* prev = curr 
//* curr = next

// Java program for reversing the linked list

class ReverseLinkedList1 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		ReverseLinkedList1 list = new ReverseLinkedList1();
		ReverseLinkedList1.head = new Node(85);
		ReverseLinkedList1.head.next = new Node(15);
		ReverseLinkedList1.head.next.next = new Node(4);
		ReverseLinkedList1.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}