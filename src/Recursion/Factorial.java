package Recursion;

public class Factorial {
    public static void main(String[] args){
        int n = 5;
        System.out.print("The factorial of " + n + " is: " + fact(n));
    }

    private static int fact(int n) {
        if(n == 0 || n == 1) return 1;

        return n*fact(n-1);
    }
}
