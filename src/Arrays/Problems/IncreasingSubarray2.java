package Arrays.Problems;
import java.util.ArrayList;

//! Using binary search

public class IncreasingSubarray2 {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,2,3};
        System.out.print(lengthOfLIS(arr));
    }

    private static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > sub.get(sub.size() - 1)){
                sub.add(nums[i]);
            }else{
                int j = binarySearch(sub,nums[i]);
                sub.set(j,nums[i]);
            }
        }

        return sub.size();
    }

    private static int binarySearch(ArrayList<Integer> sub, int i) {
        int left = 0;
        int right = sub.size() - 1;

        while(left<right){
            int mid = left + (right - left)/2;

            if(i == sub.get(mid)) return mid;

            if(sub.get(mid) > i) right = mid;
            else left = mid + 1;
        }

        return left;
    }
}
