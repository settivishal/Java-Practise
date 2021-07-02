package Arrays.Problems;


//* Example of Dynamic Programming
//! (Kandane's Algo- Refer GFG)

public class LargestContArray {
    
    public static void main(String[] args){
        int[] a = {-3,-4,4,-1,-2,1,5,-3};
        LargestContArray obj = new LargestContArray();

        System.out.print(obj.largestContSubArrary(a));
    }

    public int largestContSubArrary(int[] a){
        int max_so_far, current_max;
        max_so_far = current_max = a[0];

        for(int i = 1; i < a.length; i++){
            current_max = Math.max(current_max + a[i], a[i]);
            max_so_far = Math.max(current_max,max_so_far);
        }

        return max_so_far;
    }
}
