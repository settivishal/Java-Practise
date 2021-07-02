package Arrays.Problems;


//! Solution:
//* - One by one we'll compare both array values from starting 
//* - If both array value is same, then, put any array value in new array or list & increase both indexes(i, j)
//* - Time Complexity: O(n + m) for iterating the both array, where m - first array length, m - second array length

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {
    public static void main(String[] args){
        int[] a = {2, 2, 3, 4, 4, 4, 7, 8, 8};
        int[] b = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
        List<Integer> intersection = new ArrayList<Integer>();

        IntersectionOfSortedArrays obj = new IntersectionOfSortedArrays();

        obj.intersectionOfSortedArrays(a,b,intersection);
        System.out.print(intersection);
    }

    private void intersectionOfSortedArrays(int[] a, int[] b, List<Integer> intersection) {
        int i = 0;
        int j = 0;

        while(i < a.length && j < b.length){
            while((i < a.length - 1) && (a[i] == a[i+1])){
                i++;
            }

            while((j < b.length - 1) && (b[j] == b[j+1])){
                j++;
            }

            if(a[i] == b[j]){
                intersection.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
    }
}
