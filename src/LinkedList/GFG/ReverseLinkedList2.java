package LinkedList.GFG;

//! Recursive Method: 

//*  1) Divide the list in two parts - first node and 
//*     rest of the linked list.
//*  2) Call reverse for the rest of the linked list.
//*  3) Link rest to first.
//*  4) Fix head pointer

// Recursive Java program to reverse
// a linked list
class ReverseLinkedList2 {
	static Node head; // head of list
	
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	static Node reverse(Node head)
	{
		if (head == null || head.next == null)
			return head;

		/* reverse the rest list and put
		the first element at the end */
		Node rest = reverse(head.next);
		head.next.next = head;

		/* tricky step -- see the diagram */
		head.next = null;

		/* fix the head pointer */
		return rest;
	}

	/* Function to print linked list */
	static void print()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	static void push(int data)
	{
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}


/* Driver program to test above function*/
public static void main(String args[])
{
	/* Start with the empty list */
	
	push(20);
	push(4);
	push(15);
	push(85);

	System.out.println("Given linked list");
	print();

	head = reverse(head);

	System.out.println("Reversed Linked list");
	print();
}
}

// This code is contributed by Prakhar Agarwal
