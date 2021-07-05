package LinkedList.Singly;


// Algorithm For C/C++: Iterate through the linked list and delete all the nodes one by one. The main point here is not to access the next of the current pointer if the current pointer is deleted.
// In Java and Python, automatic garbage collection happens, so deleting a linked list is easy. Just need to change head to null.
// Java program to delete a linked list
class DeleteLinkedList
{
	Node head; // head of the list

	/* Linked List node */
	class Node
	{
		int data;
		Node next;
		Node(int d) { data = d; next = null; }
	}

	/* Function deletes the entire linked list */
	void deleteList()
	{
		head = null;
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	public static void main(String [] args)
	{
		DeleteLinkedList llist = new DeleteLinkedList();
		/* Use push() to construct below list
		1->12->1->4->1 */

		llist.push(1);
		llist.push(4);
		llist.push(1);
		llist.push(12);
		llist.push(1);

		System.out.println("Deleting the list");
		llist.deleteList();

		System.out.println("Linked list deleted");
	}
}
// This code is contributed by Rajat Mishra
