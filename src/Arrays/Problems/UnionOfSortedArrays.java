package Arrays.Problems;


//! Solution:
//* - One by one we'll compare both array values from starting 
//* - Whichever array value is smaller, put that value in new array or list & increase the index by 1
//* - If both array value is same, then, put any array value in new array or list & inclrease both indexes(i, j)
//* - At last, if you've any item left in any array, put all values of that array in new array
//* - Time Complexity: O(n + m) for iterating the both array, where m - first array length, m - second array length

import java.util.ArrayList;
import java.util.List;

public class UnionOfSortedArrays{
    static int k = 0;
    public static void main(String[] args){
        int[] a = {2, 2, 3, 4, 4, 4, 7, 8, 8};
        int[] b = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
        List<Integer> finalUnion = new ArrayList<Integer>();
        
        UnionOfSortedArrays obj = new UnionOfSortedArrays();

        obj.unionOfSortedArrays(a,b,finalUnion);
        System.out.print(finalUnion);
    }

    private void unionOfSortedArrays(int[] a, int[] b,List<Integer> finalList) {
        int i = 0;
        int j = 0;

        while((i < a.length) && (j < b.length)){
            
            //* To skip repeated values
            while((i < a.length - 1) && (a[i] == a[i+1])){
                i++;
            }

            while((j < b.length - 1) && (b[j] == b[j+1])){
                j++;
            }
            
            //* To insert elements in list
            if(a[i] < b[j]){
                finalList.add(a[i++]);
            }else if(a[i] > b[j]){
                finalList.add(b[j++]);
            }else{
                finalList.add(a[i]);
                i++;j++;
            }
        }

        //* Insert the remaining elements
        while(i < a.length){
            if((i < a.length - 1) && (a[i] == a[i+1])){
                i++;
            }else{
                finalList.add(a[i++]);
            }
        }

        while(j < b.length){
            if((j < b.length - 1) && (b[j] == b[j+1])){
                j++;
            }else{
                finalList.add(b[j++]);
            }
        }
    }
}