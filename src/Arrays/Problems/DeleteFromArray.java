package Arrays.Problems;


public class DeleteFromArray {

    static int count = 5;
    public static void main(String[] arg){
        int[] a = {12,34,45,6,13};
        DeleteFromArray obj = new DeleteFromArray();
        obj.print(a);

        obj.deleteFromEnd(a);
        obj.print(a);

        obj.deleteValue(a,12);
        obj.print(a);

        obj.deleteFromPosition(a, 2);
        obj.print(a);
    }

    private void deleteFromPosition(int[] a, int pos){
        if(pos > count || pos <= 0){
            System.out.print("Invalid position!\n");
            return;
        }

        for(int i = pos-1; i < count-1; i++){
            a[i] = a[i+1];
        }

        count--;
    }

    private void deleteValue(int[] a, int val) {
        int i;
        for(i = 0; i < count; i++){
            if(a[i] == val) break;
        }

        if(i == count){
            System.out.print("Value does not exist\n");
            return;
        }

        for(int j = i; j< count-1;j++){
            a[j] = a[j+1];
        }

        count--;
    }


    public void deleteFromEnd(int[] a) {
        if(a.length <= 0) return;
        count--;
    }
    
    private void print(int[] a) {
        for(int  i =0; i< count; i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println("");
    }
    
}