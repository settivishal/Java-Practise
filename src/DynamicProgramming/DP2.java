package DynamicProgramming;

//! Total Number of ways to reach nth Stair using step 1, 2 or 3
//* Solution - 1: Recursive approach: 
//* - We can move either 1 step, 2 step or 3 steps in a jump
//* - If we've total number ways to reach at n-1th stairs, n-2 stairs, n-3 stairs, then we can get total number of ways to reach at nth stair.
//* - Recusively we get the solution using T(n) = T(n - 1) + T(n - 2) + T(n - 3)

//* Time Complexity: O(3^n)
//* Space Complexity: O(n)

//* Solution - 2: Using Dynamic Programming (Top to Down approach): 
//* - We intialize an array with default value
//* - Now we use recursive way, but whenever we get value for a particular number, we store the value in array
//* - So by storing the value, if the same value asked again, we return from array
 
//* Time Complexity: O(n)
//* Space Complexity: O(n)

//* Solution - 3: Using Dynamic Programming (Bottom to Up approach)
//*- In this, we initialize the base conditions
//* - Now, using base values, we keep on getting the further values

//* Time Complexity: O(n)
//* Space Complexity: O(n)

public class DP2 {
    public static void main(String[] args){
        int n = 4;

        System.out.println(totalWaysToReachNthStair(n));

        int[] arr = new int[n+1];
        System.out.println(totalWaysToReachNthStairTopDown(arr,n));

        System.out.println(totalWaysToReachNthStairBottomUp(n));
        
        System.out.println(totalWaysToReachNthStairBottomUpBetter(n));
    }

    private static int totalWaysToReachNthStairBottomUpBetter(int n) {
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 0;

        for(int i = 3; i <= n; i++){
            d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }

    private static int totalWaysToReachNthStairBottomUp(int n) {
        int[] arr = new int[n+1];

        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3;i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3]; 
        }
        return arr[n];
    }

    //* ----------------Top Down DP Approach
    private static int totalWaysToReachNthStairTopDown(int[] arr, int n) {
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;

        if(arr[n] == 0){
            arr[n] = totalWaysToReachNthStair(n-1) + 
                totalWaysToReachNthStair(n-2)+
                totalWaysToReachNthStair(n-3);
        }
        return arr[n];
    }

    //*-------------Recursive Approach
    private static int totalWaysToReachNthStair(int n) {
        // if(n < 0) return 0;
        if(n == 0 || n == 1) return 1;
        if(n == 2) return 2;

        return totalWaysToReachNthStair(n-1) + 
                totalWaysToReachNthStair(n-2)+
                totalWaysToReachNthStair(n-3);
    }
}
