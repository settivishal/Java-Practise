package DynamicProgramming;

//! Maximum Sum Increasing Subsequence
//* Solution: 
//* - We initialize an array (mis), where initial value for each number is set to it's value, because in case of decreasing array sequence, there will be answer only of 1 length 
//* - Now we'll traverse in a loop from 2nd element of array & will keep checking with every element that if this is greater than previous one & if it's mis(j) + a[i] greater than mis(i), then update the MIS of current value
//* - On the same time, we also store a variable as max, which will hold the maximum value 

//* Time Complexity: O(n^2)
//* Space Complexity: O(n)

public class DP5 {
    public static void main(String[] args){
        int[] a = { 7, 1, 4, 8, 11, 2, 14, 3 };

        System.out.println(misLength(a));
    }

    private static int misLength(int[] a) {
        int[] mis = new int[a.length];

        for (int i = 0; i < mis.length; i++) {
            mis[i] = a[i];
        }

        int maxMISLength = a[0];

        for(int i = 1; i < mis.length; i++){
            for(int j = 0; j < i; j++){
                if(a[i] > a[j] && mis[j] + a[i] > mis[i]){  //! important condition
                    mis[i] = mis[j] + a[i];

                    maxMISLength = Math.max(maxMISLength,mis[i]);
                }
            }
        }
        return maxMISLength;
    }
}

