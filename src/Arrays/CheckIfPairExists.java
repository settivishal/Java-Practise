package Arrays;


//!Question:
//* check if there exists a pair which matches a given sum.

//! Solution:
//* Brute Force: 
//*  - In this, each element will add to other element in array & check if target sum matches
//*  - Take two loop & add each element with every other & check the target sum.
//*  - Complexity: O(n^2)

//* Sorting: 
//*  - Sort the array
//*  - Take two variable, one from start & other from end.
//*  - If a[start] + a[end] = target_sum, it means there exists a sum
//*  - If target_sum is greater than a[start] + a[end], then decrease end, else increase start.
//*  - Complexity: O(nlog(n))

//* Hashing:
//*  - Take one Set & iterate each element of array
//*  - If target_sum - arr[i] is in set, we got the solution, else keep adding element in array.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfPairExists {
    public static void main(String[] args){
        int[] a = {12,13,5,1,9};

        CheckIfPairExists obj = new CheckIfPairExists();

        obj.print(obj.checkPairExistsBruteForce(a,25));
        obj.print(obj.checkPairExistsSorted(a,25));
        obj.print(obj.checkPairExistsUsingList(a,25));
    }

    //* the brute force method
    private boolean checkPairExistsBruteForce(int[] a, int sum) {
        if(a.length == 0) return false;

        for(int i = 0; i< a.length-1; i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j] == sum) return true;
            }
        }

        return false;
    }

    //* working with sorted array(two pointer method)
    public boolean checkPairExistsSorted(int[] a, int sum){
        if(a.length == 0) return false;

        Arrays.sort(a);
        int start = 0, end = a.length-1;

        try {
            while(start <= end){
            if(a[start]+a[end] == sum) return true;
            else if(a[start]+a[end] > sum) end--;
            else start++;
        }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Nothing");
        }
        
        return false;
    }

    //* working with ArrayList
    public boolean checkPairExistsUsingList(int[] a, int sum){
        if(a.length == 0) return false;

        List<Integer> s = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            if(s.contains(sum - a[i])) return true;
            else s.add(a[i]);
        }

        return false;
    }

    private void print(boolean x) {
        if(x == false){
            System.out.print("No pair found\n");
        }else{
            System.out.print("Pair exists\n");
        }
    }
}

