package Arrays;


//! Question:
//* Find 1st occurrence of a value if adjacent values differ by at most K

//! Solution:
//* Brute force: Iterate each element of array starting from 0th index & check if value matches the given target value. 
//*  - Complexity - O(n)

//* Optimized Solution: 
//*  - We can use the given property that adjacent elemnents differ by atmost K 
//*  - We'll start from 0th index & take the diff = (difference between it's value & target value) / K. 
//*  - Now jump your index to diff as we're sure that if they're differ by at most k, it means target value can't occur in between
//*  - Complexity: worst case O(n), but it'll be optmized & will have less than O(n)

public class FindFirstOccurance2 {
    public static void main(String[] args){
        int a1[] = {70, 60, 70, 80, 90, 110, 130};
        int a2[] = {2, 3, 2, 4, 5, 6, 7};

        FindFirstOccurance2 obj = new FindFirstOccurance2();

        System.out.print(obj.findFirstOccurance2(a1,110,20)+"\n");
        System.out.print(obj.findFirstOccurance2(a2,7,1)+"\n");
    }

    public int findFirstOccurance2(int[] a, int num, int k){
        int start = 0;

        while(start < a.length){
            if(a[start] == num) return start;
            
            int diff = (Math.abs(num - a[start]))/k;
            diff = Math.max(1,diff); //* to skip repeating elements(i.e. when diff = 0)
            
            start += diff;
        }

        return -1;
    }
}
