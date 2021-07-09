package Recursion;

public class SelectionSort {
    // minimum index finder
    static int minIndex(int arr[], int s, int e)
    {
        int sml = Integer.MAX_VALUE;
        int mindex = 0;
        for (int i = s; i < e; i++) {
            if (sml > arr[i]) {
                sml = arr[i];
                mindex = i;
            }
        }
        return mindex;
    }

    static void fun2(int arr[], int start_index, int end_index)
    {
        if (start_index >= end_index)
            return;
        int min_index;
        int temp;

        // minIndex() returns index of minimum value in
        // array arr[start_index...end_index]
        min_index = minIndex(arr, start_index, end_index);

        temp = arr[start_index];
        arr[start_index] = arr[min_index];
        arr[min_index] = temp;

        fun2(arr, start_index + 1, end_index);
    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {6,5,4,3,2,1};
        print(arr);

        System.out.print("\nAfter sorting: ");
        fun2(arr,0,arr.length);
        print(arr);
    }
}
