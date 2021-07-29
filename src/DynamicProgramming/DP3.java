package DynamicProgramming;

public class DP3 {
    public static void main(String[] args){
        int n = 40;

        // System.out.println(minJumpsToReachNthStair(n));

        int[] arr = new int[n+1];
        System.out.println(minJumpsToReachNthStairTopDown(arr,n));

        System.out.println(minJumpsToReachNthStairBottomUp(n));
        
        System.out.println(minJumpsToReachNthStairBottomUpBetter(n));
    }

    private static int minJumpsToReachNthStairBottomUpBetter(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;

        for(int i = 3; i <= n; i++){
            d = 1 + Math.min(Math.min(a,b),c);

            a = b; 
            b = c; 
            c = d;
        }
        return d;
    }

    //* ---------------Bottom Up Approach
    private static int minJumpsToReachNthStairBottomUp(int n) {
        int[] a = new int[n+1];

        a[0] = 0;
        a[1] = a[2] = 1;

        for(int i = 3; i <= n; i++){
            a[i] = 1 + Math.min(a[i-1],Math.min(a[i-2],a[i-3]));
        }
        return a[n];
    }

    //*--------------Top Down Approach
    private static int minJumpsToReachNthStairTopDown(int[] arr, int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2 || n == 3) return 1;

        if(arr[n] == 0){
            arr[n] = 1 + Math.min(
                        Math.min(minJumpsToReachNthStair(n-1),minJumpsToReachNthStair(n-2)),minJumpsToReachNthStair(n-3));
        }
        return arr[n];
    }

    //*------------Recursive approach
    private static int minJumpsToReachNthStair(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2 || n == 3) return 1;

        return 1 + Math.min(Math.min(minJumpsToReachNthStair(n-1),minJumpsToReachNthStair(n-2)),minJumpsToReachNthStair(n-3));
    }
}
