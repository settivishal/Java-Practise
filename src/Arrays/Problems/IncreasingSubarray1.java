package Arrays.Problems;
import java.util.ArrayList;

class IncreasingSubarray1 {
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > sub.get(sub.size() - 1)){
                sub.add(nums[i]);
            }else{
                int j =0;
                while(nums[i] > sub.get(j)){
                    j++;
                }

                sub.set(j,nums[i]);
            }
        }

        return sub.size();
    }
    public static void main(String[] args){
        int[] arr = {0,1,0,3,2,3};
        System.out.print(lengthOfLIS(arr));
    }
}