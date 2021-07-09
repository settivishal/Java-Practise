package Recursion;

public class BinaryConversion {
    /* Assume that n is greater than or equal to 1 */
    static void fun2(int n)
    {
    if(n == 0)
        return;

    fun2(n/2);
    System.out.print(n%2);
    }
    public static void main(String[] args){
        fun2(2);
    }

}
