package Arrays;

//! Question: 
//* Check if multiplication of any two number matches to given value

//! Solution - 1: Using two for loop 
//* - check with every number with other number if multiplication of two number matches to given value

//* Time Complexity: O(n^2)
//* Space Complexity: O(1)

//! Solution - 2: Using Sorting
//* - Sort the array
//* - Now take two pointer from start & end
//* - If multiplication of start & end index value is greater than given value decrease the end index by 1
//* - If multiplication of start & end index value is less than given value increase the start index by 1
//* - If multiplication of start & end index value is equal to given value return true

//* Time Complexity: O(nlogn)
//* Space Complexity: O(1)

//! Solution - 3: Using HashSet
//* - We initialize hashset
//* - Traverse array & if val/a[i] doesn't exist in hashset, insert a[i] value in hashset
//* - if val/a[i] exists in hashset then there exists a pair

//* Time Complexity: O(n)
//* Space Complexity: O(n)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfPairExists2{
    public static void main(String[] args){
        int[] a = {4,1,3,7,10,8};

        CheckIfPairExists2 obj = new CheckIfPairExists2();

        System.out.print(obj.checkIfPairExistsSorted(a,21));
        System.out.println("");
        System.out.print(obj.checkIfPairExistsLists(a,21));
    }

    //* Using sorting technique(two pointer method)
    private boolean checkIfPairExistsSorted(int[] a, int val) {
        Arrays.sort(a);

        int start = 0, end = a.length-1;

        while(start < end){
            if(a[start]*a[end] == val) return true;
            else if(a[start]*a[end] < val) start++;
            else end--;
        }
        return false;
    }

    //* using ArrayLists
    private boolean checkIfPairExistsLists(int[] a, int val) {
        List<Integer> p = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if(p.contains(val/a[i])) return true;
            else p.add(a[i]);
        }
        return false;
    }
}