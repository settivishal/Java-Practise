package TCS.Set1;

import java.util.Arrays;

//*  Write a program to find the count of numbers that consists of unique digits.
//* Input:
//* Input consists of two Integer lower and upper value of a range

//* Output:
//* The output consists of a single line, print the count of unique digits in a given range. Else Print"No Unique Number"

//* Solution:
//* Input -
//* 10
//* 15

public class UniqueDigits {
    public static void main(String[] args){
        int l = 10;
        int r = 15;
        printUnique(l,r);
    }

    private static void printUnique(int l, int r) {
        int count = 0;
        for (int i = l; i <=r; i++) {
            int num = i;
            boolean[] visited = new boolean[10];
            Arrays.fill(visited,false);

            while(num != 0){
                if(visited[num%10]){
                    break;
                }

                visited[num%10] = true;

                num = num/10;
            }

            if(num == 0){
                count++;
            }
        }

        if(count > 0){
                System.out.println(count);
            }else{
                System.out.println("No Unique Number");
            }
    }
}
