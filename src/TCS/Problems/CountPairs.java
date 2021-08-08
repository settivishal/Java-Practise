package TCS.Problems;

//! Problem Statement:-   
//* You will be given an array of integers and a target value. Determine the number of pairs of array elements that have a difference equal to a target value.

//* For example, given an array of [1, 2, 3, 4] and a target value of 1, we have three values meeting the condition: 2-1 = 1, 3-2 = 1, and 4-3 = 1.

//* Function Description
//* Write a function pairs. It must return an integer representing the number of element pairs having the required difference.

//* pairs has the following parameter(s):
//* k: an integer, the target difference
//* arr: an array of integers
//* Input Format

//* The first line contains two space-separated integers n and k, the size of arr and the target value.
//* The second line contains n space-separated integers of the array arr.
//* Sample Input
//*      5 2
//*      1 5 3 4 2 

//* Sample Output
//*      2

import java.util.*;

public class CountPairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int [n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        printNoOfPairs(arr,n,k);
        sc.close();
    }

    private static void printNoOfPairs(int[] arr, int n, int k) {
        int counter = 0; 
        Set<Integer> value = new HashSet<Integer>();

        for(int i : arr){
            value.add(i);
        }

        for(int i : value){
            if(value.contains(i + k)){
                ++counter;
            }
        }

        System.out.println(counter);
    }
}
