package Recursion;

public class LogBase2 {
    /* Assume that n is greater than or equal to 1 */
    static int fun1(int n)
    {
        if (n == 1)
            return 0;
        else
            return 1 + fun1(n / 2);
    }
    public static void main(String[] args){
        System.out.println(fun1(9));
    }

}
