package Misc;

import java.util.Scanner;
public class Replace0with1
{
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from the user		
		System.out.print("Enter the number : ");		
		int number = sc.nextInt();
		//convert the number to string and then calculate its length
		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";
		//use the logic to replace all 0's with 1 in a given integer
		for(int i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Output1 : "+str1);

        System.out.println("Output2: "+str.replace('0', '1'));
		//closing scanner class(not compulsory, but good practice)
		sc.close();									
	}
}
