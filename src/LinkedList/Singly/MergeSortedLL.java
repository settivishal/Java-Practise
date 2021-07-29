package LinkedList.Singly;

public class MergeSortedLL {
    Node head;

    // Link list node
    class Node{
        int data;
        Node next;

        // Constructor
        public Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

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

    public static Node mergeTwoLists(Node l1, Node l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.data < l2.data){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    private static void printLL(Node l) {
        while(l != null){
            System.out.print(l.data+" ");
            l = l.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        MergeSortedLL l1 = new MergeSortedLL();
        MergeSortedLL l2 = new MergeSortedLL();

        l1.push(4);
        l1.push(2);
        l1.push(1);

        l2.push(4);
        l2.push(3);
        l2.push(1);
        
        printLL(l1.head);
        printLL(l2.head);

        Node l = mergeTwoLists(l1.head,l2.head);
        printLL(l);
    }
}
