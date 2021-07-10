package Stacks.Implementation;

//! Using Arrays
//* Pros: Easy to implement. Memory is saved as pointers are not involved. 
//* Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.

/* Java program to implement basic stack
operations */
class Implementation1 {
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX]; // Maximum size of Stack

	boolean isEmpty()
	{
		return (top < 0);
	}
	Implementation1()
	{
		top = -1;
	}

	boolean push(int x)
	{
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}
		else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}

	int pop()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top--];
			return x;
		}
	}

	int peek()
	{
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x = a[top];
			return x;
		}
	}
}

// Driver code
class Main {
	public static void main(String args[])
	{
		Implementation1 s = new Implementation1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop() + " Popped from stack");
        System.out.println(s.peek()+" is the top element");
	}
}
