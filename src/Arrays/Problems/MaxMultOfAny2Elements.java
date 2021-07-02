//! Question:
//* find max multilpication of any 2 numbers in an array

//! Solution - 1: Using two for loop 
//* - initialize a max variable
//* - check with every number with other number if multiplication of two number is greater than max 

//* Time Complexity: O(n^2)
//* Space Complexity: O(1)

//! Solution - 2: Using Sorting
//* - Sort the array
//* - Now multiply starting two numbers & last two numbers & whichever is maximum, return that number

//* Time Complexity: O(nlog(n))
//* Space Complexity: O(1)

//! Solution - 3: Using one loop
//* - We initialize smallest, secondSmallest, greatest & secondGreatest
//* - Now we iterate on loop & keep on updating above value as per current value
//* - Multiple smallest * secondSmallest, greatest * secondGreatest
//* - Whichever is maximum, return that

//* Time Complexity: O(n)
//* Space Complexity: O(1)

package Arrays.Problems;


import java.util.Arrays;

public class MaxMultOfAny2Elements {
    public static void main(String[] args){
        int[] a = {-4,2,3,-10,4,-15,3,6};

        MaxMultOfAny2Elements obj= new MaxMultOfAny2Elements();

        System.out.print(obj.maxMultOfAny2Elements2(a) == -1 ? "Invalid array" : obj.maxMultOfAny2Elements2(a));
        System.out.println("");
        System.out.print(obj.maxMultOfAny2Elements1(a) == -1 ? "Invalid array" : obj.maxMultOfAny2Elements2(a));
    }
    //* using sorted array
    private int maxMultOfAny2Elements1(int[] a) {
        if(a.length < 2) return -1;

        if(a.length == 2) return a[0]*a[1];

        Arrays.sort(a);
        return Math.max(a[a.length-1]*a[a.length-2], a[0]*a[1]); //* array can contain negative numbers
    }

    //* using one loop
    private int maxMultOfAny2Elements2(int[] a) {
        if(a.length < 2) return -1;

        if(a.length == 2) return a[0]*a[1];
        
        int smallest = Integer.MAX_VALUE ,secondSmallest = Integer.MAX_VALUE ;
        int greatest = Integer.MIN_VALUE ,secondGreatest = Integer.MIN_VALUE ;

        for (int i = 0; i < a.length; i++) {
            if(a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] < secondSmallest) {
                secondSmallest = a[i];
            }

            if(a[i] > greatest){
                secondGreatest = greatest;
                greatest = a[i];
            }
            else if(a[i] > secondGreatest){
                secondGreatest = a[i];
            }
        }
        return Math.max(smallest*secondSmallest, greatest*secondGreatest);
    }
}
