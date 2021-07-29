package DynamicProgramming;

public class DP7 {
    public static void main(String[] args){
        String s1 = "abcdki";
        String s2 = "abcdlo";

        System.out.println(getLCSubstring(s1,s2,s1.length(),s2.length(),0));
        
        System.out.println(getLCSubstringBottomUp(s1,s2,s1.length(),s2.length()));
    }

    //*-----------------Bottom Up Solution
    private static int getLCSubstringBottomUp(String s1, String s2, int l1, int l2) {
        if(l1 == 0 || l2 == 0) return 0;

        int lcs = 0;

        int[][] arr = new int[s1.length()+1][s2.length()+1];

        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    arr[i][j] = 1 + arr[i-1][j-1];

                    lcs = Math.max(lcs, arr[i][j]);
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        return lcs;
    }

    //*-----------------Recursive approach
    private static int getLCSubstring(String s1, String s2, int l1, int l2, int countOfLCS) {
        if(l1 == 0 || l2 == 0) return countOfLCS;

        if(s1.charAt(l1-1) == s2.charAt(l2-1))
            countOfLCS = getLCSubstring(s1, s2, l1-1, l2-1, countOfLCS+1);
        
        int count1 = getLCSubstring(s1, s2, l1-1, l2, 0);
        int count2 = getLCSubstring(s1, s2, l1, l2-1, 0);

        return Math.max(countOfLCS, Math.max(count1, count2));
    }
}
