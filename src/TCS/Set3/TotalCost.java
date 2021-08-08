package TCS.Set3;

//! Question:
//* For hiring a car, a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees per hour. Given the total time of travel in minutes in X.
//* The task is to find the total travelling cost in rupees.
//* Note : While converting minutes into hours, ceiling value should be considered as the total number of hours.
//* For example : If the total travelling time is 90 minutes, i.e. 1.5 hours, it must be considered as 2 hours.

//* Example :
//* Input :
//* 20 -- r1
//* 4  -- n
//* 40 -- r2
//* 300 -- x

//* Output :
//* 120

import java.util.Scanner;

public class TotalCost {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int n = in.nextInt();
        int r2 = in.nextInt();
        int x = in.nextInt();
        int total = 0;

        double hours = Math.ceil(x/60);

        if(n < hours){
            total = (int)(r1*n + r2*(hours-n));
        }else{
            total = r1*n;
        }

        System.out.println(total);

        in.close();
    }
}
