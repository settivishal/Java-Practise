package TCS.Problems;

//! Problem Statement:- A jail has a number of prisoners and a number of treats to pass out to them. Their jailer decides the fairest way to divide the treats is to seat the prisoners around a circular table in sequentially numbered chairs. A chair number will be drawn from a hat. Beginning with the prisoner in that chair, one candy will be handed to each prisoner sequentially around the table until all have been distributed.

//* The jailer is playing a little joke, though. The last piece of candy looks like all the others, but it tastes awful. Determine the chair number occupied by the prisoner who will receive that candy.

//* For example, there are 4 prisoners and 6 pieces of candy. The prisoners arrange themselves in seats numbered 1 to 4 . Let’s suppose two are drawn from the hat. Prisoners receive candy at positions 2,3,4,1,2,3. The prisoner to be warned sits in chair number 3

//* Function Description

//* Write a function saveThePrisoner. It should return an integer representing the chair number of the prisoner to warn.

//* saveThePrisoner has the following parameter(s):

//* n: an integer, the number of prisoners
//* m: an integer, the number of sweets
//* s: an integer, the chair number to begin passing out sweets from
//* Input Format

//* The first line contains an integer t, denoting the number of test cases.
//* The next t lines each contain 3 space-separated integers:
//* – : n the number of prisoners
//* – : m the number of sweets
//* – : s the chair number to start passing out treats at 
//* Output Format

// For each test case, print the chair number of the prisoner who receives the awful treat on a new line.

import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while(t != 0){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int temp = 0;

            for(int i = 0; i < m; i++){
                temp = (s+i)%n;
            }

            int last = ((m-1)+(s-1))%n + 1;

            System.out.println(temp);
            System.out.println(last);

            t--;
        }

        in.close();
    }
}
