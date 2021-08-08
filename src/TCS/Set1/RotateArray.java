package TCS.Set1;

//! Question: 
//* Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
//* Note : Keep the first of the array unaltered.

//* Example 1:
//* 5  ---Value of N
//* {10, 20, 30, 40, 50}  ---Element of Arr[]
//* 2  -----Value of K

//* Output :
//* 40 50 10 20 30

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();
        k %= N;

        printSortedArray1(arr,N,k);
        in.close();
    }

    private static void printSortedArray1(int[] arr, int n, int k) {
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        
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
}
