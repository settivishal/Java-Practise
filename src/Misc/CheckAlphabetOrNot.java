package Misc;

import java.util.Scanner;
public class CheckAlphabetOrNot
{										//class declaration
    public static void main(String[] args)
    {										//main method declaration
        char c;
        Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Character : ");                       //Input character
        c = sc.next().charAt(0);
										//condition for checking characters
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			System.out.println(c + " is an Alphabet");
		else
			System.out.println(c + " is not an Alphabet");

        System.out.println(Character.isAlphabetic(c));
		sc.close();			                               
	}
} 
