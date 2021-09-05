package Misc;

class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }

    public static void main(String[] args){
        int[] nums1 = {7,8,10,0,0,0,0};
        int[] nums2 = {3,5,6,9};
        int n = nums2.length;
        int m = nums1.length - nums2.length;
        merge(nums1,m,nums2,n);
        
        for(int i : nums1){
            System.out.print(i+" ");
        }
    }
}