package SearchSort;

public class BinarySearch2 {

    public static void main(String[] args){
        int[] a = {12,34,45,65,83};

        int i = search(a,83,0,a.length-1);
        if(i == -1){
            System.out.println("Value doesn't Exist in the Array!");
        }else{
            System.out.println(i);
        }
    }

    public static int search(int[] a, int val, int start, int end) {
        while(start <= end){
            int mid = start + (end - start)/2;

            if(a[mid] == val) return mid;
            else if(a[mid] > val) end = mid - 1;
            else start = mid + 1;
        }

        return -1;
    }
}
