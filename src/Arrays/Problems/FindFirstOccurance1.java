package Arrays.Problems;


//! Question: 
//* Find 1st occurrence of a value in array if adjacent values differ by 1

//! solution:
//* Solution:
//* Brute force: Iterate each element of array starting from 0th index & check if value matches the given target value. 
//*  - Complexity - O(n)

//* Optimized Solution: 
//*  - We can use the given property that adjacent elemnents differ by one position
//*  - We'll start from 0th index & take the difference between it's value & target value. 
//*  - Now jump your index to difference as we're sure that if they're differ by one, it means target value can't occur in between
//*  - Complexity: worst case O(n), but it'll be optmized & will have less than O(n)

public class FindFirstOccurance1 {
    public static void main(String[] args){
        int a1[] = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        int a2[] = {2, 3, 2, 4, 5, 6, 7};

        FindFirstOccurance1 obj = new FindFirstOccurance1();

        System.out.print(obj.findFirstOccurance1(a1,2)+"\n");
        System.out.print(obj.findFirstOccurance1(a2,3)+"\n");
    }

    public int findFirstOccurance1(int[] a, int num) {
        int start = 0;

        while(start < a.length){
            if(a[start] == num) return start;

            int diff = Math.abs(a[start] - num);
            start += diff;
        }
        
        return -1;
    }

    public char[] findFirstOccurance2(int[] a1, int i, int j) {
        return null;
    }
}
