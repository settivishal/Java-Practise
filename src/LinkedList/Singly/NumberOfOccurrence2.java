package LinkedList.Singly;

//! Recursive Method

// Represents node of a linkedlist
class Node {
	int data;
	Node next;
	Node(int val)
	{
		data = val;
		next = null;
	}
}

class NumberOfOccurrence2 {

	// global variable for counting frequency of
	// given element k
	static int frequency = 0;

	/* Given a reference (pointer to pointer) to the head
	of a list and an int, push a new node on the front
	of the list. */

	static Node push(Node head, int new_data)
	{
		// allocate node
		Node new_node = new Node(new_data);

		// link the old list off the new node
		new_node.next = head;

		// move the head to point to the new node
		head = new_node;

		return head;
	}

	/* Counts the no. of occurrences of a node
	(search_for) in a linked list (head)*/
	static int count(Node head, int key)
	{
		if (head == null)
			return frequency;
		if (head.data == key)
			frequency++;
		return count(head.next, key);
	}

	// Driver Code
	public static void main(String args[])
	{
		// Start with the empty list
		Node head = null;

		/* Use push() to construct below list
		1->2->1->3->1 */
		head = push(head, 1);
		head = push(head, 3);
		head = push(head, 1);
		head = push(head, 2);
		head = push(head, 1);

		/* Check the count function */
		System.out.print("count of 1 is " + count(head, 1));
	}
}
