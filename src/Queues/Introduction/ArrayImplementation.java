package Queues.Introduction;

//! Array implementation Of Queue 
//* For implementing queue, we need to keep track of two indices, front and rear. We enqueue an item at the rear and dequeue an item from the front. If we simply increment front and rear indices, then there may be problems, the front may reach the end of the array. The solution to this problem is to increase front and rear in circular manner.

//! Pros of Array Implementation:  

//* Easy to implement.
//* Cons of Array Implementation:  

//* Static Data Structure, fixed size.
//* If the queue has a large number of enqueue and dequeue operations, at some point (in case of linear increment of front and rear indexes) we may not be able to insert elements in the queue even if the queue is empty (this problem is avoided by using circular queue).

// Java program for array
// implementation of queue

// A class to represent a queue
class Queue1 {
	int front, rear, size;
	int capacity;
	int array[];

	public Queue1(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	// Queue is full when size becomes
	// equal to the capacity
	boolean isFull(Queue1 queue)
	{
		return (queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Queue1 queue)
	{
		return (queue.size == 0);
	}

	// Method to add an item to the queue.
	// It changes rear and size
	void enqueue(int item)
	{
		if (isFull(this))
			return;
		this.rear = (this.rear + 1)
					% this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item
						+ " enqueued to queue");
	}

	// Method to remove an item from queue.
	// It changes front and size
	int dequeue()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.front = (this.front + 1)
					% this.capacity;
		this.size = this.size - 1;
		return item;
	}

	// Method to get front of queue
	int front()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	// Method to get rear of queue
	int rear()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}
}

public class ArrayImplementation {
	public static void main(String[] args)
	{
		Queue1 queue = new Queue1(1000);

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);

		System.out.println(queue.dequeue()
						+ " dequeued from queue\n");

		System.out.println("Front item is "
						+ queue.front());

		System.out.println("Rear item is "
						+ queue.rear());
	}
}