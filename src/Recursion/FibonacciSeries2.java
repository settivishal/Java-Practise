package Recursion;

//! With memoization

import java.util.HashMap;

class FibonacciSeries2 
{   static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    public static int fib(int N)
    {
        if(cache.containsKey(N)){
            return cache.get(N);
        }
        
        int result;
        if(N < 2) result = N;
        else result = fib(N-1)+fib(N-2);
        
        cache.put(N,result);
        return result;
    }
    public static void main(String[] args){
        int n= 5;
        System.out.println("The fibonacci series is: ");

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}