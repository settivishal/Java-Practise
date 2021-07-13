package Greedy;

//! Question:
//* Given an array of jobs where every job has a deadline and associated profit if the job is finished before the deadline. It is also given that every job takes a single unit of time, so the minimum possible deadline for any job is 1. How to maximize total profit if only one job can be scheduled at a time.

//! Following is the algorithm.

//* 1) Sort all jobs in decreasing order of profit. 
//* 2) Iterate on jobs in decreasing order of profit.For each job , do the following :

//* For each job find an empty time slot from deadline to 0. If found empty slot put the job in the slot and mark this slot filled.

// Program to find the maximum profit
// job sequence from a given array
// of jobs with deadlines and profits
import java.util.*;

class JobSequencing
{
	// Each job has a unique-id,
	// profit and deadline
	char id;
	int deadline, profit;

	// Constructors
	public JobSequencing() {}

	public JobSequencing(char id, int deadline, int profit)
	{
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

	// Function to schedule the jobs take 2
	// arguments arraylist and no of jobs to schedule
	void printJobScheduling(ArrayList<JobSequencing> arr, int t)
	{
		// Length of array
		int n = arr.size();

		// Sort all jobs according to
		// decreasing order of profit
		Collections.sort(arr,
						(a, b) -> b.profit - a.profit);

		// To keep track of free time slots
		boolean result[] = new boolean[t];

		// To store result (Sequence of jobs)
		char job[] = new char[t];

		// Iterate through all given jobs
		for (int i = 0; i < n; i++)
		{
			// Find a free slot for this job
			// (Note that we start from the
			// last possible slot)
			for (int j
				= Math.min(t - 1, arr.get(i).deadline - 1);
				j >= 0; j--) {

				// Free slot found
				if (result[j] == false)
				{
					result[j] = true;
					job[j] = arr.get(i).id;
					break;
				}
			}
		}

		// Print the sequence
		for (char jb : job)
		{
			System.out.print(jb + " ");
		}
		System.out.println();
	}

	// Driver code
	public static void main(String args[])
	{
		ArrayList<JobSequencing> arr = new ArrayList<JobSequencing>();

		arr.add(new JobSequencing('a', 2, 100));
		arr.add(new JobSequencing('b', 1, 19));
		arr.add(new JobSequencing('c', 2, 27));
		arr.add(new JobSequencing('d', 1, 25));
		arr.add(new JobSequencing('e', 3, 15));
	
		// Function call
		System.out.println("Following is maximum "
						+ "profit sequence of jobs");

		JobSequencing JobSequencing = new JobSequencing();

		// Calling function
		JobSequencing.printJobScheduling(arr, 3);
	}
}