package Misc;

import java.util.*;

public class CountFrequencies

{

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int[] freq = new int[100];

        int size, k, j, count;


        // Input size of array 

        System.out.print(   "Enter size of array: ");

        size = sc.nextInt();


           /* Input elements in array */

        System.out.print(   "Enter elements in array:");

        for(k=0; k<size; k++)

        {

            arr[k] = sc.nextInt();


               // Initially initialize frequencies to -1  

            freq[k] = -1;

        }

        for(k=0; k<size; k++)

        {

            count = 1;

            for(j=k+1; j<size; j++)

            {

                   // If duplicate element is found 

                if(arr[k]==arr[j])

                {

                    count++;


                       // Make sure not to count frequency of same element again 

                    freq[j] = 0;

                }

            }


               // If frequency of current element is not counted 

            if(freq[k] != 0)

            {

                freq[k] = count;

            }

        }

           // Print frequency of each element

        System.out.print("Frequency of all elements of array: ");

        for(k=0; k<size; k++)

        {

            if(freq[k] != 0)

            {

                System.out.print(arr[k] +    "0 occurs" + freq[k] +    " times" + "n");

            }

        }
        sc.close();
    }
}