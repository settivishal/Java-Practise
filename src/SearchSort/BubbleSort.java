package SearchSort;

//* In bubble sort algorithm, array is traversed from first element to last element. Here, current element is compared with the next element. If current element is greater than the next element, it is swapped.

public class BubbleSort{
    public static void main(String args[]){
        int[] a = {12,5,3,-1};

        BubbleSort obj = new BubbleSort();
        obj.print(a);

        obj.bubbleSort(a);
        obj.print(a);
    }

    private void bubbleSort(int[] a) {
        if(a.length == 0 || a.length == 1) return;

        int n = a.length;
        for(int i = 0; i< n; i++){
            for(int j = 1; j<n-i; j++){
                if(a[j-1] > a[j]){
                    int k = a[j-1];
                    a[j-1] = a[j];
                    a[j] = k;
                }
            }
        }
    }

    private void print(int[] a) {
        for(int i =0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    
}