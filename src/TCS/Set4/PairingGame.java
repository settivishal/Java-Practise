package TCS.Set4;

import java.util.Scanner;

public class PairingGame {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = countWays(n);
        System.out.println(res);
        in.close();
    }

    private static int countWays(int n) {
        if(n < 0) return -1;
        if(n%2 != 0) return n;
        
        int comb = fact(n)/fact(n-1) + fact(n)/(fact(n-2)*fact(2));
        return comb;
    }

    private static int fact(int n) {
        // if(n == 1) return 1;
        // return n*fact(n-1);

        // int[] fact = new int[101];
        // fact[0] = 1;
        // fact[1] = 1;

        int a = 1;
        int c = -1;

        for (int i = 2; i <= n; i++) {
            c = i*a;
            a = c;
        }

        if(n < 2) return a;
        return c;
    }
}
