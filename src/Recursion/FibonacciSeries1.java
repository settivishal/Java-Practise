package Recursion;

//! Write a program and recurrence relation to find the Fibonacci series of n where n>2 . 
//! Without memoization

//* Mathematical Equation:  
//* n if n == 0, n == 1;      
//* fib(n) = fib(n-1) + fib(n-2) otherwise;

//* Recurrence Relation: 
//* T(n) = T(n-1) + T(n-2) + O(1)

//* time complexity
//* T(n) =   θ(2^n\2)

public class FibonacciSeries1 {
    public static void main(String[] args){
        int n= 5;
        System.out.println("The fibonacci series is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static int fib(int n) {
        if(n == 0) return 0;

        if(n == 1 || n == 2) return 1;

        return fib(n-1)+fib(n-2);
    }
}
