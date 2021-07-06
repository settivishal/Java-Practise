package LinkedList.Doubly;

//! The task is to create a doubly linked list by inserting nodes such that list remains in ascending order on printing from left to right. Also, we need to maintain two pointers, head (points to first node) and tail (points to last node).

//*Algorithm: 
//* The task can be accomplished as:  

//* If Linked list is empty then make both the left and right pointers point to the node to be inserted and make its previous and next field point to NULL.
//* If node to be inserted has value less than the value of first node of linked list then connect that node from previous field of first node.
//* If node to be inserted has value more than the value of last node of linked list then connect that node from next field of last node.
//* If node to be inserted has value in between the value of first and last node, then check for appropriate position and make connections.

/* Java program to insetail nodes in doubly
linked list such that list remains in
ascending order on printing from left
to right */

class InsertNodeSortedWay2
{

	static Node head, tail;

    // A linked list node
    static class Node
    {
        int info;
        Node prev, next;
    }

	// Function to insetail new node
	static void nodeInsert(int key)
	{
		Node p = new Node();
		p.info = key;
		p.next = null;

		// If first node to be insetailed in doubly
		// linked list
		if (head == null)
		{
			head = p;
			tail = p;
			head.prev = null;
			return;
		}

		// If node to be insetailed has value less
		// than first node
		if (p.info < head.info)
		{
			p.prev = null;
			head.prev = p;
			p.next = head;
			head = p;
			return;
		}
			
		// If node to be insetailed has value more
		// than last node
		if (p.info > tail.info)
		{
			p.prev = tail;
			tail.next = p;
			tail = p;
			return;
		}

		// Find the node before which we need to
		// insert p.
		Node temp = head.next;
		while (temp.info < p.info)
				temp = temp.next;
				
		// Insert new node before temp
		(temp.prev).next = p;
		p.prev = temp.prev;
		temp.prev = p;
		p.next = temp;
	}

	// Function to print nodes in from left to right
	static void printList(Node temp)
	{
		while (temp != null)
		{
				System.out.print(temp.info + " ");
				temp = temp.next;
		}
	}

	// Driver code
	public static void main(String args[])
	{
		head = tail = null;
		nodeInsert(30);
		nodeInsert(50);
		nodeInsert(90);
		nodeInsert(10);
		nodeInsert(40);
		nodeInsert(110);
		nodeInsert(60);
		nodeInsert(95);
		nodeInsert(23);

		System.out.println("Doubly linked list on printing from left to right");
		printList(head);
	}
}
