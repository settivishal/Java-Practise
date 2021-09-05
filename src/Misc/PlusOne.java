package Misc;

//! Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

//* The digits are stored such that the most significant digit is at the head of the list.

import java.util.ArrayList;

public class PlusOne {
    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int j = 0;
        while(j < A.size()){
            if(A.get(j) == 0){
                A.remove(j);
                continue;
            } 
            else{
                break;
            }
        }

        int n = A.size();
        for(int i = n-1; i >= 0; i--){
            if(A.get(i) < 9){
                A.set(i,A.get(i)+1);
                return A;
            }

            A.set(i,0);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n+1; i++){
            if(i == 0){
                res.add(1);
                continue;
            }
            res.add(0);
        }
        return res;
    }
    public static void main(String[] args){
        ArrayList<Integer> in = new ArrayList<>();
        in.add(0);
        in.add(6);
        in.add(0);
        in.add(6);
        in.add(4);
        in.add(8);
        in.add(8);
        in.add(1);

        System.out.println(plusOne(in));
    }
}
