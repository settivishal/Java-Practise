package SearchSort;

//* Algorithm 
//* To sort an array of size n in ascending order: 
//* 1: Iterate from arr[1] to arr[n] over the array. 
//* 2: Compare the current element (key) to its predecessor. 
//* 3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

public class InsertionSort {
    public static void main(String args[]){
        int[] a = {5,2,14,6,3};

        InsertionSort obj = new InsertionSort();
        obj.print(a);

        obj.insertionSort(a);
        obj.print(a);
    }

    private void insertionSort(int[] a) {
        if(a.length < 1) return;

        for(int i = 1; i< a.length; i++){
            int key = a[i];
            int j;

            for(j = i-1; j>=0 && a[j] > key; j--){    //* for descending order replace a[j] > key with a[j] < key
                a[j+1] = a[j];
            }
            a[j+1] = key;
        }
    }

    private void print(int[] a) {
        for(int i =0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}

