package Arrays;


//! Solution:
//* 1) Initialize leftsum  as 0
//* 2) Get the total sum of the array as sum
//* 3) Iterate through the array and for each index i, do following.
//*     a)  Update sum to get the right sum.  
//*            sum = sum - arr[i] 
//* sum is now right sum
//*     b) If leftsum is equal to sum, then return current index. 
//* update leftsum for next iteration.
//*     c) leftsum = leftsum + arr[i]
//* 4) return -1 
//* If we come out of loop without returning then
//* there is no equilibrium index

public class EquillibriumPoint {
    public static void main(String[] args){
        int[] a = {1};

        EquillibriumPoint obj = new EquillibriumPoint();

        System.out.print("Equillibrium point is: " + obj.equillibriumPoint(a));
    }

    private int equillibriumPoint(int[] a) {
        if(a.length<0) return -1;

        int sum = sum(a);
        int sum_so_far = 0;

        for(int i = 0; i< a.length; i++){
            sum -= a[i];
            if(sum == sum_so_far) return a[i];
            sum_so_far += a[i];
        }

        return -1;
    }

    private int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
