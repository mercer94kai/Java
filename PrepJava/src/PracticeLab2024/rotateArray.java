package src.PracticeLab2024;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] nums={-1,-100,3,99};
        arrRot(nums,2);
        System.out.println(Arrays.toString(nums));
    }

    private static void arrRot(int[] nums, int k) {

        int n=nums.length;
        while(k>0){
            int temp=nums[n-1];
            for (int i=n-1;i>=1;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=temp;
            k--;
        }
    }
}
