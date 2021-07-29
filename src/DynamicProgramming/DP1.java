package DynamicProgramming;

//! Get Fibonacci Number
//* Solution - 1: Recursive approach: 
//* - Recursively we get the solution using F(n) = F(n - 1) + F(n - 2)

//* Time Complexity: O(2^n)
//* Space Complexity: O(n)

//* Solution - 2: Using Dynamic Programming (Top to Down approach): 
//* - We initialize an array with default value
//* - Now we recursive way, but whenever we get value for a particular number, we store the value in array
//* - So by storing the value, if the same value asked again, we return from array

//* Time Complexity: O(n)
//* Space Complexity: O(n)

//* Solution - 3: Using Dynamic Programming (Bottom to Up approach)
//* - In this, we initialize the base conditions
//* - Now, using base values, we keep on getting the further values

//* Time Complexity: O(n)
//* Space Complexity: O(n)

public class DP1 {
    public static void main(String[] args){
        int n = 8;
        System.out.println(getFibonacciNumber(n));

        int[] arr = new int[n+1];
        System.out.println(getFibonacciNumberTopDown(arr,n));

        System.out.println(getFibonacciNumberBottomUp(n));
        
        System.out.println(getFibonacciNumberBottomUpBetter(n));
    }

    //*-------------Better Bottom-Up approach
    private static int getFibonacciNumberBottomUpBetter(int n) {
        int a = 0;
        int b = 1;
        int c = -1;;

        for(int i = 2; i <= n; i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }

    //*-------------Bottom-Up approach
    private static int getFibonacciNumberBottomUp(int n) {
        int[] f = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        
        return f[n];
    }

    //* ----------Top-Down Approach
    private static int getFibonacciNumberTopDown(int[] arr, int n) {
        if(n < 2) return n;

        if(arr[n] == 0)
            arr[n] = getFibonacciNumberTopDown(arr, n-1) + getFibonacciNumberTopDown(arr, n-2);

        return arr[n];
    }

    //* --------------Recursive solution
    private static int getFibonacciNumber(int n) {
        if(n < 2) return n;
        
        return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }

    
}
