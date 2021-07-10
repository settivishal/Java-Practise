package Stacks.Implementation;

//! Space Optimized Version 
//* The above approach can be optimized. We can limit the number of elements in the auxiliary stack. We can push only when the incoming element of the main stack is smaller than or equal to the top of the auxiliary stack. Similarly during pop, if the pop-off element equal to the top of the auxiliary stack, remove the top element of the auxiliary stack. Following is the modified implementation of push() and pop(). 

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

class SpecialStack2 extends Stack<Integer> {
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

            /* push only when the incoming
            element of main stack is smaller
            than or equal to top of auxiliary stack */
            if (x <= y)
                min.push(x);
        }
    }

    /* SpecialStack's member method to
    remove an element from it. This method
    removes top element from min stack also. */
    public Integer pop()
    {
        int x = super.pop();
        int y = min.pop();

        /* Push the popped element y back
        only if it is not equal to x */
        if (y != x)
            min.push(y);
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
		SpecialStack2 s = new SpecialStack2();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());
	}
}
