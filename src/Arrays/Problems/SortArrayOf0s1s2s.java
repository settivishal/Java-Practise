package Arrays.Problems;


//* We can solve the problem using a single scan by maintaining the correct order of 0’s, 1’s, and 2’s using variables. Actually, we have three types of elements to be placed in sorted order, therefore, we divide the given array into four sections using three-pointers. Let us name these pointers as low, mid, and high.
//* a[0…low-1] only zeroes
//* a[low..mid-1] only ones
//* a[mid…high] unknown
//* a[high+1..n-1] only twos
//* Think of low and high as the range [low, high) for values in the middle partition. The middle partition will contain the values from low up to, but not including, high.
//* All values are less than low end up in the left partition.
//* Finally, all values greater than or equal to high end up in the right partition.

//* Algorithm Steps
//* Initialise three pointers low = 0, mid = 0 and high = n -1
//* Run a loop until mid<=high
//* If (a[mid] ==0), then swap the element with the element low and shrink the unknown range by doing low++ and mid++.
//* If (a[mid] ==1), then simply increment mid (mid++), thus further shrinking unknown range.
//* If (a[mid] ==2), then swap it with an element in high range and decrement high (high--). Then, again traverse the array from mid-index only, as the element at this index has not been considered yet.

public class SortArrayOf0s1s2s {
    public static void main(String[] args){
        int[] a = {0,1,1,0,2,2,1,0,2};

        SortArrayOf0s1s2s.print(a);

        SortArrayOf0s1s2s.sortArrayOf012(a);
        SortArrayOf0s1s2s.print(a);
    }

    private static void sortArrayOf012(int[] a) {
        int low = 0, mid = 0, high = a.length-1;

        while(mid<=high){
            if(a[mid] == 0){
                int k = a[mid];
                a[mid] = a[low];
                a[low] = k;
                low++;
                mid++;
                continue;
            }

            if(a[mid] == 1){
                mid++;
                continue;
            }

            if(a[mid] == 2){
                int k = a[mid];
                a[mid] = a[high];
                a[high] = k;
                high--;
                continue;
            }
        }
    }

    private static void print(int[] a) {
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
