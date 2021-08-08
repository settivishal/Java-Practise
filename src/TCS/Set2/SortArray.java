package TCS.Set2;

//! Given an array Arr[ ] of N integer numbers. The task is to rewrite the array by putting all multipliers at the end of the given array.

//* Note : The order of the numbers which are not the multiplier of 10 should remain unaltered ,and similarly the order of the numbers which are the multiplier of 10 should remain unaltered.

//* For example :
//* Suppose N =9 and Arr[]={10, 12, 5, 40, 30, 7, 5, 9, 10}
//* You have to push all the multiple of 10 at the end of the array Arr[].
//* Hence the output is : 12 5 7 5 9 10 40 30 10

import java.util.ArrayList;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.nextInt();
        }

        printSortedArray(arr,N);

        in.close();
    }

    private static void printSortedArray(int[] arr, int n) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(arr[i]%10 == 0){
                l2.add(arr[i]);
            }else{
                l1.add(arr[i]);
            }
        }

        for(int i = 0; i < l1.size(); i++){
            arr[i] = l1.get(i);
        }

        int k = l1.size();

        for (int i = 0; i < l2.size(); i++) {
            arr[k++] = l2.get(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
