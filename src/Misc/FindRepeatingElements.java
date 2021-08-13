package Misc;

import java.util.Scanner;
class FindRepeatingElements{
    public static void Repeating(int a[],int n){
        int count;
        System.out.println("Repeating number in array");
        for(int i=0;i<n;i++)
        {
            count=0;
            for (int j = i+1; j < n; j++)
            {
                if(a[i]==a[j] && i!=j)
                System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Repeating(a,size);
        sc.close();
    }
}
