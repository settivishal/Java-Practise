package LinkedList.Doubly;


// A complete working Java program to
// find size of doubly linked list.

// Represents a doubly linked list node

class SizeOfDLL
{

    static class Node
    {
        int data;
        Node next, prev;
        Node(int val)
        {
            data = val;
            next = null;
            prev = null;
        }
    }
	/* Function to add a node to front of doubly
	linked list */
	static Node push(Node head, int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.prev = null;
		if (head != null)
			head.prev = new_node;
		head = new_node;
			
		return head;
	}

	// This function returns size of doubly linked list
	static int findSize(Node node)
	{
		int res = 0;
		while (node != null)
		{
				res++;
				node = node.next;
		}

		return res;
	}

	// Driver Code
	public static void main(String args[])
	{
		Node head = null;
		head = push(head, 4);
		head = push(head, 3);
		head = push(head, 2);
		head = push(head, 1);
		System.out.println(findSize(head));
	}
}
