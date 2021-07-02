package Arrays.Problems;

//! Question:
//* Print Element greater or equal to all elements to left.
public class ElemGreaterEquale {
    public static void main(String[] args){
        int[] a = {14,15,8,9,5,2};

        ElemGreaterEquale obj = new ElemGreaterEquale();
        obj.elemGreaterEqualTo(a);
    }

    private void elemGreaterEqualTo(int[] a) {
        int max = Integer.MIN_VALUE;

        for(int i = a.length-1; i >= 0; i--){
            if(max < a[i]) {
                max=a[i];
                System.out.print(max + " ");
            }
        }
    }
}
