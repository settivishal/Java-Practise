package TCS.Problems;

//* Write a program to print all the combinations of the given word with or without meaning (when unique characters are given).

//* Sample Input:
//* abc

//* Output:
//* abc
//* acb
//* bac
//* bca
//* cba
//* cab

public class Permute {
    public static void main(String[] args){
        String s = "abc";
        int n = s.length();
        permute(s,0,n-1);
    }

    private static void permute(String s, int l, int r) {
        if(l == r) System.out.println(s);

        else{
            for (int i = l; i <= r; i++) {
                s = swap(s,l,i);
                permute(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }

    private static String swap(String s, int l, int i) {
        char temp;
        char[] charArray = s.toCharArray();

        temp = charArray[l];
        charArray[l] = charArray[i];
        charArray[i] = temp;
        return String.valueOf(charArray);
    }
}
