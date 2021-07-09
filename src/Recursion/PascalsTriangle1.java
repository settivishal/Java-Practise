package Recursion;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle1 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>(rowIndex);
        for(int i = 0; i <= rowIndex; i++){
            list.add(getNum(rowIndex,i));
        }
        
        return list;
    }
    
    public static int getNum(int r, int c){
        if(r == 0 || c == 0 || r == c) return 1;
        
        return getNum(r-1,c-1)+getNum(r-1,c);
    }

    public static void main(String[] args){
        System.out.print(getRow(3));
    }
}