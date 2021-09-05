package SearchSort;

class SelectionSort2 {  
    static void swap(int A[], int i, int j) {  
        int temp = A[i];  
        A[i] = A[j];  
        A[j] = temp;  
    }  

    static int findMinIndex(int A[], int start) {  
        int min_index = start;  
        ++start;  
        while(start < A.length) {  
            if(A[start] < A[min_index])  
                min_index = start;  
            ++start;  
        }  
        return min_index;  
    }  

    static void selectionSort(int A[]) {  
        for(int i = 0; i < A.length; ++i) {  
            int min_index = findMinIndex(A, i);  
            if(i != min_index)  
                swap(A, i, min_index);  
        }  
    }  

    public static void main(String[] args) {  
        int A[] = {5, 2, 6, 7, 2, 1, 0, 3};  
        selectionSort(A);  
        for(int num : A)  
            System.out.print(num + " "); 
    }  
}
