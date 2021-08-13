package Arrays;

//! Solution:
//* - We'll take a Set & a variable firstRepeat
//* - We'll iterate from last element & if value doesn't present in Set, put this value in Set.
//* - If element already present in Set, update this value with firstRepeat. 
//* - The last updated value in firstRepeat will contain the repeated value, as we'll movinf from back.
//* - Time Complexity: O(n) for iterating the complete array
//* - Space Complexity: O(n) for Set

import java.util.ArrayList;
import java.util.List;

public class FirstRepeatingElement {
    public static void main(String[] args){
        int[] a = {2,3,4,3,4,3,5,7};

        FirstRepeatingElement obj = new FirstRepeatingElement();

        System.out.print(obj.firstRepeatingElement(a));
    }

    public int firstRepeatingElement(int[] a){
        List<Integer> list = new ArrayList<Integer>();
        int firstRepeat = -1;

        for(int i = a.length - 1; i >= 0; i--){  //* For edge cases like {2,3,3,4,2} 
            if(list.contains(a[i])) firstRepeat = a[i];
            else list.add(a[i]);
        }
        return firstRepeat;
    }
}
