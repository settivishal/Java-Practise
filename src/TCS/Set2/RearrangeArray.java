package TCS.Set2;

//! Given an array Arr[ ] of N integers and a positive integer K. The task is to Divide the array into two sub array from right after the Kth position and slide the left sub array of K elements to the end.

//* Example 1:
//* 5  ---Value of N
//* {10, 20, 30, 40, 50}  ---Element of Arr[]
//* 2  -----Value of K

//* Output :
//* 30 40 50 10 20

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class RearrangeArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        printSortedArray1(arr,N,k);
        printSortedArray2(arr,N,k);

        in.close();
    }

    
    //* implementing left rotation(anti-clockwise)
    private static void printSortedArray1(int[] arr, int n, int k) {
        reverse(arr,0,n-1);
        reverse(arr,0,k);
        reverse(arr,k+1,n-1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    private static void reverse(int[] arr, int i, int j) {
        while(i < j){
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }
    
    //* implementation using queue
    private static void printSortedArray2(int[] arr, int n, int k) {
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            q.add(arr[i]);
        }

        for (int i = 0; i < k; i++) {
            int temp = q.peek();
            q.remove();
            q.add(temp);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
