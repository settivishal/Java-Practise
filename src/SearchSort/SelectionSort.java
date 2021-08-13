package SearchSort;

//* The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
//* 1) The subarray which is already sorted. 
//* 2) Remaining subarray which is unsorted.
//* In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
//* Following example explains the above steps: 

//* arr[] = 64 25 12 22 11

//* Find the minimum element in arr[0...4]
//* and place it at beginning
//* 11 25 12 22 64

//* Find the minimum element in arr[1...4]
//* and place it at beginning of arr[1...4]
//* 11 12 25 22 64

//* Find the minimum element in arr[2...4]
//* and place it at beginning of arr[2...4]
//* 11 12 22 25 64

//* Find the minimum element in arr[3...4]
//* and place it at beginning of arr[3...4]
//* 11 12 22 25 64 

public class SelectionSort {
    public static void main(String[] args){
        int[] a = {5,14,2,3,1};

        SelectionSort obj = new SelectionSort();
        obj.print(a);

        obj.selectionSort(a);
        obj.print(a);
    }

    private void selectionSort(int[] a) {
        if(a.length <= 1) return;

        for(int i = 0; i < a.length - 1; i++){
            int index = i;
            for(int j = i+1; j < a.length ;j++){
                if(a[j]<a[index]){
                    index = j;
                }
            }

            int k = a[i];
            a[i] = a[index];
            a[index] = k;

        }
    }

    private void print(int[] a) {
        for(int i =0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
