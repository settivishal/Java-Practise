package Greedy;

//! Method 1: Recursion by Brute-Force algorithm OR Exhaustive Search.
//* Approach: A simple solution is to consider all subsets of items and calculate the total weight and value of all subsets. Consider the only subsets whose total weight is smaller than W. From all such subsets, pick the maximum value subset.
//* Optimal Sub-structure: To consider all subsets of items, there can be two cases for every item. 

//* Case 1: The item is included in the optimal subset.
//* Case 2: The item is not included in the optimal set.
//* Therefore, the maximum value that can be obtained from ‘n’ items is the max of the following two values. 

//* Maximum value obtained by n-1 items and W weight (excluding nth item).
//* Value of nth item plus maximum value obtained by n-1 items and W minus the weight of the nth item (including nth item).
//* If the weight of ‘nth’ item is greater than ‘W’, then the nth item cannot be included and Case 1 is the only possibility.

/* A Naive recursive implementation
of 0-1 Knapsack problem */
class ZeroOneKnapSack {

	// A utility function that returns
	// maximum of two integers
	static int max(int a, int b)
	{
	return (a > b) ? a : b;
	}

	// Returns the maximum value that
	// can be put in a knapsack of
	// capacity W
	static int knapSack(int W, int wt[], int val[], int n)
	{
		// Base Case
		if (n == 0 || W == 0)
			return 0;

		// If weight of the nth item is
		// more than Knapsack capacity W,
		// then this item cannot be included
		// in the optimal solution
		if (wt[n - 1] > W)
			return knapSack(W, wt, val, n - 1);

		// Return the maximum of two cases:
		// (1) nth item included
		// (2) not included
		else
			return max(val[n - 1] + knapSack(W - wt[n - 1], wt,val, n - 1), knapSack(W, wt, val, n - 1));
	}

	// Driver code
	public static void main(String args[])
	{
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));
	}
}
