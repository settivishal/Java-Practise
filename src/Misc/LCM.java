package Misc;

import java.util.Scanner;
public class LCM
{
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from the user		
		System.out.print("Enter the first number : ");		
		int num1 = sc.nextInt();
		//input from the user
		System.out.print("Enter the second number : ");		
		int num2 = sc.nextInt();
		//logic for finding lcm of both numbers
                int i;
		int a =(num1 > num2)? num1 : num2;
		for(i = a ; i <= num1*num2 ; i=i+a)
		{
			if(i % num1 == 0 && i % num2 == 0)
				break;
		}
		//printing result
		System.out.println("LCM of "+num1+" and "+num2+" is : "+i);
		//closing scanner class(not compulsory, but good practice)
        sc.close();
	}
}