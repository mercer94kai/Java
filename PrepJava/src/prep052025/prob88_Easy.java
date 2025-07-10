package prep052025;

import java.util.Arrays;

public class prob88_Easy {
    public static void main(String[] args) {
        int[] nums1 = {2,3,6,8};
        int m = 4;
        int[] nums2 = {1,3,4};
        int n = 3;

        merge(nums1,m,nums2,n);
        //System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        int[] nums3=new int[m+n];

        while (i>=0 && j>=0){
            if (nums1[i]>nums2[j]){
                nums3[k--]=nums1[i--];
            } else if (nums1[i]==nums2[j]) {
                nums3[k--]=nums1[i--];
                nums3[k--]=nums2[j--];
            } else{
                nums3[k--]=nums2[j--];
            }
        }

        nums3[k]=(i==0)?nums1[i]:nums2[j];
        System.out.println(Arrays.toString(nums3));
    }
}
