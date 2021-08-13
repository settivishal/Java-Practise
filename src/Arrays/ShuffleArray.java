//! Solution
//* Solution:
//* - we'll iterate the array from 1st value to last value
//* - Now using the Random class, we create a random value which will give me value between 0 to arr.length
//* - Now I swap the current index value to random index value
//* - So when i do this for all the number, it shuffle value that it's non deterministic

//* Time Complexity: O(n)
//* Space Complexity: O(1)

package Arrays;


public class ShuffleArray {
    public static void main(String[] args){
        int[] a = {3,7,4,1,8,9,10,2,6,5,15,11,14,12,18,13,16,19,17,21,20};

        ShuffleArray obj = new ShuffleArray();

        obj.shuffleArray(a);
        obj.print(a);
    }

    public void shuffleArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            double random = Math.floor(Math.random()*a.length);
            int temp = a[i];
            a[i] = a[(int) random];
            a[(int) random] = temp;
        }
    }

    private void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}