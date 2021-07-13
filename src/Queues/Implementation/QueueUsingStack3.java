package Queues.Implementation;

//! Queue can also be implemented using one user stack and one Function Call Stack. 
//* Below is modified Method 2 where recursion (or Function Call Stack) is used to implement queue using only one user defined stack. 

//* enQueue(x)
//*   1) Push x to stack1.

//* deQueue:
//*   1) If stack1 is empty then error.
//*   2) If stack1 has only one element then return it.
//*   3) Recursively pop everything from the stack1, store the popped item 
//*     in a variable res,  push the res back to stack1 and return res

// Java Program to implement a queue using one stack

import java.util.Stack;

public class QueueUsingStack3 {
	// class of queue having two stacks
	static class Queue {
		Stack<Integer> stack1;
	}

	/* Function to push an item to stack*/
	static void push(Stack<Integer> top_ref, int new_data)
	{
		/* put in the data */
		top_ref.push(new_data);
	}

	/* Function to pop an item from stack*/
	static int pop(Stack<Integer> top_ref)
	{
		/*If stack is empty then error */
		if (top_ref == null) {
			System.out.println("Stack Underflow");
			System.exit(0);
		}
		// return element from stack
		return top_ref.pop();
	}

	/* Function to enqueue an item to queue */
	static void enQueue(Queue q, int x)
	{
		push(q.stack1, x);
	}

	/* Function to deQueue an item from queue */
	static int deQueue(Queue q)
	{
		int x, res = 0;
		/* If the stacks is empty then error */
		if (q.stack1.isEmpty()) {
			System.out.println("Q is Empty");
			System.exit(0);
		}
		// Check if it is a last element of stack
		else if (q.stack1.size() == 1) {
			return pop(q.stack1);
		}
		else {

			/* pop an item from the stack1 */
			x = pop(q.stack1);

			/* store the last deQueued item */
			res = deQueue(q);

			/* push everything back to stack1 */
			push(q.stack1, x);
			return res;
		}
		return 0;
	}

	/* Driver function to test above functions */
	public static void main(String[] args)
	{
		/* Create a queue with items 1 2 3*/
		Queue q = new Queue();
		q.stack1 = new Stack<>();

		enQueue(q, 1);
		enQueue(q, 2);
		enQueue(q, 3);

		/* Dequeue items */
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
		System.out.print(deQueue(q) + " ");
	}
}