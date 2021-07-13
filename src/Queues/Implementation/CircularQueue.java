package Queues.Implementation;

//! Operations on Circular Queue:

//* Front:Get the front item from queue.
//* Rear: Get the last item from queue.
//* enQueue(value) This function is used to insert an element into the circular queue. In a circular queue, the new element is always inserted at Rear position.
//* Steps:

//* Create a new node dynamically and insert value into it.
//* Check if front==NULL, if it is true then front = rear = (newly created node)
//* If it is false then rear=(newly created node) and rear node always contains the address of the front node.
//* deQueue() This function is used to delete an element from the circular queue. In a queue, the element is always deleted from front position.
//* Steps:
//* Check whether queue is empty or not means front == NULL.
//* If it is empty then display Queue is empty. If queue is not empty then step 3
//* Check if (front==rear) if it is true then set front = rear = NULL else move the front forward in queue, update address of front in rear node and return the element.

// Java program for insertion and
// deletion in Circular Queue

class CircularQueue {

	// Structure of a Node
	static class Node {
		int data;
		Node link;
	}

	static class Queue {
		Node front, rear;
	}

	// Function to create Circular queue
	static void enQueue(Queue q, int value)
	{
		Node temp = new Node();
		temp.data = value;
		if (q.front == null)
			q.front = temp;
		else
			q.rear.link = temp;

		q.rear = temp;
		q.rear.link = q.front;
	}

	// Function to delete element from Circular Queue
	static int deQueue(Queue q)
	{
		if (q.front == null) {
			System.out.printf("Queue is empty");
			return Integer.MIN_VALUE;
		}

		// If this is the last node to be deleted
		int value; // Value to be dequeued
		if (q.front == q.rear) {
			value = q.front.data;
			q.front = null;
			q.rear = null;
		}
		else // There are more than one nodes
		{
			Node temp = q.front;
			value = temp.data;
			q.front = q.front.link;
			q.rear.link = q.front;
		}

		return value;
	}

	// Function displaying the elements of Circular Queue
	static void displayQueue(Queue q)
	{
		Node temp = q.front;
		System.out.printf("\nElements in Circular Queue are: ");
		while (temp.link != q.front) {
			System.out.printf("%d ", temp.data);
			temp = temp.link;
		}
		System.out.printf("%d", temp.data);
	}

	/* Driver of the program */
	public static void main(String args[])
	{
		// Create a queue and initialize front and rear
		Queue q = new Queue();
		q.front = q.rear = null;

		// Inserting elements in Circular Queue
		enQueue(q, 14);
		enQueue(q, 22);
		enQueue(q, 6);

		// Display elements present in Circular Queue
		displayQueue(q);

		// Deleting elements from Circular Queue
		System.out.printf("\nDeleted value = %d", deQueue(q));
		System.out.printf("\nDeleted value = %d", deQueue(q));

		// Remaining elements in Circular Queue
		displayQueue(q);

		enQueue(q, 9);
		enQueue(q, 20);
		displayQueue(q);
	}
}