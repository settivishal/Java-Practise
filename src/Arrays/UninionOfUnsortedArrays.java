package Arrays;


//! Solution:
//* - Take a set & one by one put all values of first array & second array into it
//* - Set only contains the unique elements, so it'll have the union of both two arrays
//* - Time Complexity: O(n + m) for iterating the both array, where m - first array length, m - second array length


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UninionOfUnsortedArrays {
    public static void main(String[] args){
        int a[] = {4, 2, 3, 5, 4, 2, 3};
        int b[] = {9, 1, 7, 2, 4, 2, 1, 2};
        List<Integer> union2 = new ArrayList<Integer>();
        Set<Integer> finalUnion = new HashSet<>();

        UninionOfUnsortedArrays obj = new UninionOfUnsortedArrays();

        obj.unionOfunsortedArrays(a,b,union2);
        System.out.print(union2);

        obj.unionOfTwoUnSortedArray(a,b,finalUnion);
        System.out.print(finalUnion);
    }

    //* using ArrayList
    private void unionOfunsortedArrays(int[] a, int[] b, List<Integer> union2) {
        
        for (int i = 0; i < a.length; i++) {
            if(union2.contains(a[i])){
                continue;
            }
            union2.add(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if(union2.contains(b[i])){
                continue;
            }
            union2.add(b[i]);
        } 
    }

    //* Using Set(Hashset) 
    //! Learn HashSet
    public void unionOfTwoUnSortedArray(int[] arr1, int[] arr2, Set<Integer> finalList) {
        int i = 0;
        int j = 0;

        while (i < arr1.length) {
        finalList.add(arr1[i++]);
        }

        while (j < arr2.length) {
        finalList.add(arr2[j++]);
        }
    }
}
