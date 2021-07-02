package Arrays.Problems;


//!Question:
//* Search a given value in unsorted or sorted array.

public class SearchValueInArray {
    public static void main(String[] args){
        int[] a = {30,2,7,15,50};
        int[] sortedArray = {2,7,15,30,50};

        SearchValueInArray obj = new SearchValueInArray();

        int x = obj.searchValueInArrayUnsorted(a,15);
        obj.print(x);

        int y = obj.searchValueInArraySorted(sortedArray, 2);
        obj.print(y);
    }

    private int searchValueInArraySorted(int[] a, int val) {
        if(a.length<0) return -1;

        int start = 0, end = a.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(a[mid] == val) return mid;

            if(a[mid] > val){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        
        return -1;
    }

    private int searchValueInArrayUnsorted(int[] a,int val) {
        if(a.length<0) return -1;

        for(int i = 0; i< a.length; i++){
            if(a[i] == val) return i;
        }
        return -1;
    }

    private void print(int index) {
        if(index == -1){
            System.out.print("No element found\n");
        }else{
            System.out.print(index+"\n");
        }
    }
}
