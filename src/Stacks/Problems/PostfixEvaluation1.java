package Stacks.Problems;

//! Following is algorithm for evaluation postfix expressions.
//* 1) Create a stack to store operands (or values).
//* 2) Scan the given expression and do following for every scanned element.
//* …..a) If the element is a number, push it into the stack
//* …..b) If the element is a operator, pop operands for the operator from stack. Evaluate the operator and push the result back to the stack
//* 3) When the expression is ended, the number in the stack is the final answer

// Java program to evaluate value of a postfix expression

import java.util.Stack;

public class PostfixEvaluation1
{
	// Method to evaluate value of a postfix expression
	static int evaluatePostfix(String exp)
	{
		//create a stack
		Stack<Integer> stack=new Stack<>();
		
		// Scan all characters one by one
		for(int i=0;i<exp.length();i++)
		{
			char c=exp.charAt(i);
			
			// If the scanned character is an operand (number here),
			// push it to the stack.
			if(Character.isDigit(c))
			stack.push(c - '0');
			
			// If the scanned character is an operator, pop two
			// elements from stack apply the operator
			else
			{
				int val1 = stack.pop();
				int val2 = stack.pop();
				
				switch(c)
				{
					case '+':
					stack.push(val2+val1);
					break;
					
					case '-':
					stack.push(val2- val1);
					break;
					
					case '/':
					stack.push(val2/val1);
					break;
					
					case '*':
					stack.push(val2*val1);
					break;
			}
			}
		}
		return stack.pop();	
	}
	
	// Driver program to test above functions
	public static void main(String[] args)
	{
		String exp="231*+9-";
		System.out.println("postfix evaluation: "+evaluatePostfix(exp));
	}
}
