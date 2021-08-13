package Misc;

// Java program to count all distinct elements
// in a given array
import java.util.Arrays;

class CountDistinctElements{
    static int countDistinct(int arr[], int n){
		// First sort the array so that all
		// occurrences become consecutive
		Arrays.sort(arr);

		// Traverse the sorted array
		int res = 0;
		for (int i = 0; i < n; i++)
		{

			// Move the index ahead while
			// there are duplicates
			while (i < n - 1 &&
					arr[i] == arr[i + 1])
			{
				i++;
			}
			res++;
		}
		return res;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		int n = arr.length;
		System.out.println(countDistinct(arr, n));
	}
}
