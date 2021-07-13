package Greedy;

//* The greedy choice is to always pick the next activity whose finish time is least among the remaining activities and the start time is more than or equal to the finish time of the previously selected activity. We can sort the activities according to their finishing time so that we always consider the next activity as minimum finishing time activity.
//* 1) Sort the activities according to their finishing time 
//* 2) Select the first activity from the sorted array and print it. 
//* 3) Do the following for the remaining activities in the sorted array. 
//* …….a) If the start time of this activity is greater than or equal to the finish time of the previously selected activity then select this activity and print it.
//* In the following C implementation, it is assumed that the activities are already sorted according to their finish time.

// The following implementation assumes that the activities
// are already sorted according to their finish time

class ActivitySelection1
{
	// Prints a maximum set of activities that can be done by a single
	// person, one at a time.
	// n --> Total number of activities
	// s[] --> An array that contains start time of all activities
	// f[] --> An array that contains finish time of all activities
	public static void printMaxActivities(int s[], int f[], int n)
	{
	int i, j;
	
	System.out.print("Following activities are selected : ");
	
	// The first activity always gets selected
	i = 0;
	System.out.print(i+" ");
	
	// Consider rest of the activities
	for (j = 1; j < n; j++)
	{
		// If this activity has start time greater than or
		// equal to the finish time of previously selected
		// activity, then select it
		if (s[j] >= f[i])
		{
			System.out.print(j+" ");
			i = j;
		}
	}
	}
	
	// driver program to test above function
	public static void main(String[] args)
	{
	int s[] = {1, 3, 0, 5, 8, 5};
	int f[] = {2, 4, 6, 7, 9, 9};
	int n = s.length;
		
	printMaxActivities(s, f, n);
	}
	
}
