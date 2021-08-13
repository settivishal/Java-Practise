package DynamicProgramming;

//! Get Longest Increasing Subsequence Length
//*Solution: 
//* - We initialize an array, where initial value for each number is set to 1, because a number is also a subsequence of length 1 
//* - Now we'll traverse in a loop from 2nd element of array & will keep checking with every element that if this is greater than previous one & if it's LIS(j) + 1 greater than LIS(j), then update the LIS of current value
//* - On the same time, we also store a variable as max, which will hold the maximum value 

//* Time Complexity: O(n^2)
//* Space Complexity: O(n)

public class DP4 {
    public static void main(String[] args){
        int[] a = { 7, 1, 4, 8, 11, 2, 14, 3 };

        System.out.println(lisLength(a));
    }

    private static int lisLength(int[] a) {
        int[] lis = new int[a.length];

        for (int i = 0; i < lis.length; i++) {
            lis[i] = 1;
        }

        int maxLISLength = 1;

        for(int i = 1; i < lis.length; i++){
            for(int j = 0; j < i; j++){
                if(a[i] > a[j] && lis[i] <= lis[j]){ //! important condition
                    lis[i] = lis[j] + 1;

                    maxLISLength = Math.max(maxLISLength,lis[i]);
                }
            }
        }
        return maxLISLength;
    }
}
