package TCS.Problems;

//! Question: 
//* Bastin once had trouble finding the numbers in a string. The numbers are distributed in a string across various test cases. There are various numbers in each test case you need to find the number in each test case. Each test case has various numbers in sequence. You need to find only those numbers which do not contain 9. For eg, if the string contains "hello this is alpha 5051 and 9475".You will extract 5051 and not 9475. You need only those numbers which are consecutive and you need to help him find the numbers. Print the largest number.

//* Note: Use long long for storing the numbers from the string.
//* Input:
//* The first line consists of T test cases and the next T lines contain a string.

//* Output:
//* For each string output the number stored in that string if various numbers are there print the largest one. If a string has no numbers print -1.

import java.util.Scanner;

public class ExtractNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t;
        t = in.nextInt();
        in.nextLine();

        while(t != 0){
            String s;
            s = in.next();
            int n = s.length();
            int n9 = 0;
            String res="",num="";
            for(int i = 0; i < n; i++){
                n9 = 0;
                num = "";
                while(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    if(s.charAt(i) == '9') n9 = 1;

                    num = num + s.charAt(i);
                    i++;
                }

                if(n9 == 0 && num != ""){
                    long a = Long.parseLong(num);
                    long b = -1;

                    if(res != ""){
                        b = Long.parseLong(res);
                    }

                    if(a > b){
                        res = num;
                    }
                }

                if(res == ""){
                    System.out.print("-1");
                }else{
                    System.out.println(res);
                }
            }
            t--;
        }

        in.close();
    }
}
