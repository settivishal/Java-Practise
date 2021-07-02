package Arrays.Problems;

public class FindMissingUnsortedArray {
    public static void main(String[] args){
        int[] a = {2,4,1,3,6,7,8};

        FindMissingUnsortedArray obj = new FindMissingUnsortedArray();

        System.out.println(obj.findMissingUnsortedArray(a,a.length+1));
    }

    public int findMissingUnsortedArray(int[] a, int l) {
        int sum = (l*(l+1))/2;

        for(int i = 0; i < l-1; i++){
            sum -= a[i];
        }

        return sum;
    }
    
}
