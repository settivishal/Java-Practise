package Arrays.Problems;


//! Solution:
//* - Take a set & one by one put all values of first array
//* - Now, iterate 2nd array & check if it present in 1st array, put this value in another new Set (i.e finalSet)
//* - At last, all unique common elments will be present in finalSet
//* - Time Complexity: O(n + m) for iterating the both array, where m - first array length, m - second array length

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfUnsortedArrays {
    public static void main(String[] args){
        int a[] = {4, 2, 3, 5, 4, 2, 3};
        int b[] = {9, 1, 7, 2, 4, 2, 1, 2};
        List<Integer> intersection2 = new ArrayList<Integer>();
        Set<Integer> finalIntersection = new HashSet<>();

        IntersectionOfUnsortedArrays obj = new IntersectionOfUnsortedArrays();

        obj.intersectionOFUnsortedArrays(a,b,intersection2);
        System.out.print(intersection2);

        obj.intersectionOfTwoUnSortedArray(a,b,finalIntersection);
        System.out.print(finalIntersection);
    }

    //* using lists
    private void intersectionOFUnsortedArrays(int[] a, int[] b, List<Integer> intersection2) {
        List<Integer> tempList = new ArrayList<Integer>();

        for(int i = 0; i< a.length; i++){
            if(tempList.contains(a[i])) continue;
            tempList.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            if(tempList.contains(b[i])){
                if(intersection2.contains(b[i])) continue;
                intersection2.add(b[i]);
            }
        }
    }

    //* Using set(HashSet)
    public void intersectionOfTwoUnSortedArray(int[] arr1, int[] arr2, Set<Integer> finalIntersection) {
        int i = 0;
        int j = 0;
        Set<Integer> tempSet = new HashSet<>();

        while (i < arr1.length) {
        tempSet.add(arr1[i++]);
        }

        while (j < arr2.length) {
        if (tempSet.contains(arr2[j])) {
            finalIntersection.add(arr2[j]);
        }

        j++;
    }
  }
}
