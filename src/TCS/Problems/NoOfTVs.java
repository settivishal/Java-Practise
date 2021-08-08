package TCS.Problems;

import java.util.*;

class Solution 
{
  
    static int R1, R2, N;
    static int M[] = { 0, 25, 16, 9, 4, 1, 0, 1, 4, 9, 16, 25, 36 };
    static int D[] ={ 0, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 1, 2, 3, 4, 5, 6,7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    static int MM[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  
    static int func (int p) 
    {
        int s, sum = 0;
        for (int m = 1; m <= 12; m++)
        {
            for (int d = 1; d <= MM[m]; d++){
                s = (int) Math.min (M[m] + D[d], N);
                sum +=(int) Math.min (p, s) * R2 + (s - (int) Math.min (p, s)) * R1;
            } 
        }   
        return sum;
    }
  
    public static void main (String[]args) 
    {
    
        Scanner sc = new Scanner (System.in);
        int R, l = 0;
        N = sc.nextInt ();
        R1 = sc.nextInt ();
        R2 = sc.nextInt ();
        R = sc.nextInt ();
        int nn = N;
    
        while (nn-- != 0){
            if (func (nn) >= R){
                l = nn;
                break;
            }
        }
        System.out.println (N - l);
    }
}
