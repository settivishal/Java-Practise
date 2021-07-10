package Stacks.Implementation;

//! Solution(Without Optimization): 
//* Use two stacks: one to store actual stack elements and the other as an auxiliary stack to store minimum values. The idea is to do push() and pop() operations in such a way that the top of the auxiliary stack is always the minimum. Let us see how push() and pop() operations work.

//* Push(int x) // inserts an element x to Special Stack 
//* 1) push x to the first stack (the stack with actual elements) 
//* 2) compare x with the top element of the second stack (the auxiliary stack). Let the top element be y. 
//* …..a) If x is smaller than y then push x to the auxiliary stack. 
//* …..b) If x is greater than y then push y to the auxiliary stack.
//* int Pop() // removes an element from Special Stack and return the removed element 
//* 1) pop the top element from the auxiliary stack. 
//* 2) pop the top element from the actual stack and return it.
//* Step 1 is necessary to make sure that the auxiliary stack is also updated for future operations.
//* int getMin() // returns the minimum element from Special Stack 
//* 1) Return the top element of the auxiliary stack.

// Java implementation of SpecialStack
// Note : here we use Stack class for
// Stack implementation

import java.util.Stack;

/* A class that supports all the
stack operations and one additional
operation getMin() that returns
the minimum element from stack at
any time. This class inherits from
the stack class and uses an
auxiliary stack that holds minimum
elements */

class SpecialStack1 extends Stack<Integer> {
	Stack<Integer> min = new Stack<>();

	/* SpecialStack's member method to
insert an element to it. This method
	makes sure that the min stack is
also updated with appropriate minimum
	values */
	void push(int x)
	{
		if (isEmpty() == true) {
			super.push(x);
			min.push(x);
		}
		else {
			super.push(x);
			int y = min.pop();
			min.push(y);
			if (x < y)
				min.push(x);
			else
				min.push(y);
		}
	}

	/* SpecialStack's member method to
insert an element to it. This method
	makes sure that the min stack is
also updated with appropriate minimum
	values */
	public Integer pop()
	{
		int x = super.pop();
		min.pop();
		return x;
	}

	/* SpecialStack's member method to get
minimum element from it. */
	int getMin()
	{
		int x = min.pop();
		min.push(x);
		return x;
	}

	/* Driver program to test SpecialStack
methods */
	public static void main(String[] args)
	{
		SpecialStack1 s = new SpecialStack1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());
	}
}
