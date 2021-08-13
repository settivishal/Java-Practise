package SearchSort;

// Illustration of partition() : 

// arr[] = {10, 80, 30, 90, 40, 50, 70}
// Indexes:  0   1   2   3   4   5   6 

// low = 0, high =  6, pivot = arr[h] = 70
// Initialize index of smaller element, i = -1

// Traverse elements from j = low to high-1
// j = 0 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
// i = 0 
// arr[] = {10, 80, 30, 90, 40, 50, 70} // No change as i and j  are same

// j = 1 : Since arr[j] > pivot, do nothing
// No change in i and arr[]

// j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
// i = 1
// arr[] = {10, 30, 80, 90, 40, 50, 70} // We swap 80 and 30 

// j = 3 : Since arr[j] > pivot, do nothing
// No change in i and arr[]

// j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
// i = 2
// arr[] = {10, 30, 40, 90, 80, 50, 70} // 80 and 40 Swapped
// j = 5 : Since arr[j] <= pivot, do i++ and swap arr[i] with arr[j] 
// i = 3 
// arr[] = {10, 30, 40, 50, 80, 90, 70} // 90 and 50 Swapped 

// We come out of loop because j is now equal to high-1.
// Finally we place pivot at correct position by swapping
// arr[i+1] and arr[high] (or pivot) 
// arr[] = {10, 30, 40, 50, 70, 90, 80} // 80 and 70 Swapped 

// Now 70 is at its correct place. All elements smaller than
// 70 are before it and all elements greater than 70 are after
// it.

public class QuickSort{
    public static void main(String[] args){
        int[] a = {10,7,8,9,1,5};
        int n = a.length;

        quickSort(a,0,n-1);
        System.out.println("sorted array: ");
        printArray(a,n);
    }

    public static void quickSort(int[] a, int low, int high) {
        if(low<high){
            int pi = partition(a,low,high);

            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];

        int i = low-1;

        for(int j = low; j <= high; j++){
            if(a[j] < pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }

    private static void swap(int[] a, int i, int j) {
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
    }

    public static void printArray(int[] a, int n) {
        for(int i = 0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("");
    }
}