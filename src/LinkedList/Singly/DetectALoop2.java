package LinkedList.Singly;

//* Approach: This solution requires modifications to the basic linked list data structure. 

//* Have a visited flag with each node.
//* Traverse the linked list and keep marking visited nodes.
//* If you see a visited node again then there is a loop. This solution works in O(n) but requires additional information with each node.
//* A variation of this solution that doesn’t require modification to basic data structure can be implemented using a hash, just store the addresses of visited nodes in a hash and if you see an address that already exists in hash then there is a loop.
//! O(n)


class DetectALoop2{

// Link list node
static class Node
{
	int data;
	Node next;
	int flag;
};

static Node push(Node head_ref, int new_data)
{
	
	// Allocate node
	Node new_node = new Node();

	// Put in the data
	new_node.data = new_data;

	new_node.flag = 0;

	// Link the old list off the new node
	new_node.next = head_ref;

	// Move the head to point to the new node
	head_ref = new_node;
	return head_ref;
}

// Returns true if there is a loop in linked
// list else returns false.
static boolean detectLoop(Node h)
{
	while (h != null)
	{
		
		// If this node is already traverse
		// it means there is a cycle
		// (Because you we encountering the
		// node for the second time).
		if (h.flag == 1)
			return true;

		// If we are seeing the node for
		// the first time, mark its flag as 1
		h.flag = 1;

		h = h.next;
	}
	return false;
}

// Driver code
public static void main(String[] args)
{
	
	// Start with the empty list
	Node head = null;

	head = push(head, 20);
	head = push(head, 4);
	head = push(head, 15);
	head = push(head, 10);

	// Create a loop for testing
	head.next.next.next.next = head;

	if (detectLoop(head))
		System.out.print("Loop found");
	else
		System.out.print("No Loop");
}
}
