package Recursion;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle2 {
    int[][] memo;
    public List<Integer> getRow(int rowIndex) {
        memo = new int[rowIndex+1][];
        
        for(int i = 0; i <memo.length; i++){
            memo[i] = new int[i+1];
        }
        
        ArrayList<Integer> list = new ArrayList<>(rowIndex);
        
        for(int i = 0; i <= rowIndex; i++){
            list.add(getNum(rowIndex,i));
        }
        
        return list;
    }
    
    public int getNum(int r, int i){
        if(r == 0 || i == 0 || r == i) return 1;
        
        if(memo[r][i] == 0){
            memo[r][i] = getNum(r-1,i-1)+getNum(r-1,i);
        }
        
        return memo[r][i];
    }
    public static void main(String[] args){
        PascalsTriangle2 obj = new PascalsTriangle2();
        System.out.print(obj.getRow(3));
    }
}