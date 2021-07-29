package DynamicProgramming;

//! Longest Common Subsequence
//* Solution1: Recursive Basic Solution 
//* - We start from last character of both string & check if it's matching then check remaining characters & add 1
//* - It's not matching, then Get the maximum of lcs(n, m-1), lcs(n-1, m)

//* Time Complexity: O(2^n)
//* Space Complexity: O(n * m)

//* Solution - 2: Top Down DP Solution
//* - We start from last character of both string & check if it's matching then check remaining characters & add 1
//* - It's not matching, then Get the maximum of lcs(n, m-1), lcs(n-1, m)
//* - Now whenever we get any value, we store the value, so whenever this will ask again, we're return from 2d array

//* Time Complexity: O(n * m)
//* Space Complexity: O(n * m)

//* Solution - 2: Bottom UP DP Solution
//* - We initialize 2D array
//* - We start from 1st character of both string & if matching then add 1 + arr[n-1][m-1]
//* - It's not matching, then Get the maximum of arr[n][m-1], arr[n-1][m]
//* - at last we return arr[n][m]

//* Time Complexity: O(n * m)
//* Space Complexity: O(n * m)

public class DP6{
    public static void main(String[] args){
        String s1 = "abcdef";
        String s2 = "abdef";

        System.out.println(getLCS(s1,s2,s1.length(),s2.length()));

        Integer[][] arr = new Integer[s1.length()+1][s2.length()+1];
        System.out.println(getLCSTopDown(arr,s1,s2,s1.length(),s2.length()));

        System.out.println(getLCSBottomUp(s1,s2,s1.length(),s2.length()));
    }

    //*------------Bottom Up approach
    public static int getLCSBottomUp(String s1,String s2,int l1,int l2){
        if(l1 == 0|| l2 == 0) return 0;

        int[][] arr = new int[l1+1][l2+1];

        for (int i = 1; i <= l1; i++) {
            for(int j = 1; j <= l2; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    arr[i][j] = 1 + arr[i - 1][j - 1];
                }else{
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }

        return arr[l1][l2];
    }

    //*-------------Top Down Approach
    public static int getLCSTopDown(Integer[][] arr,String s1,String s2,int l1,int l2){
        if(l1 == 0 || l2 == 0) return 0;

        if(arr[l1][l2] == null){
            if(s1.charAt(l1 - 1) == s2.charAt(l2 -1)){
                arr[l1][l2] = 1 + getLCSTopDown(arr,s1,s2,l1-1,l2-1);
            }else{
                arr[l1][l2] = Math.max(getLCSTopDown(arr,s1,s2,l1-1,l2),getLCSTopDown(arr,s1,s2,l1,l2-1));
            }
        }

        return arr[l1][l2];
    }

    //*-------------basic recursion
    public static int getLCS(String s1,String s2,int l1,int l2){
        if(l1 == 0 || l2 == 0) return 0;

        if(s1.charAt(l1-1) == s2.charAt(l2-1)){
            return 1 + getLCS(s1,s2,l1-1,l2-1);
        }

        return Math.max(getLCS(s1,s2,l1-1,l2),getLCS(s1,s2,l1,l2-1));
    }
}
