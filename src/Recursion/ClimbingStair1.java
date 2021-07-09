package Recursion;

//! Without Memoization

public class ClimbingStair1{
    public static int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }
    public static void main(String[] args){
        int n = 5;
        System.out.print(climbStairs(n));
    }
}