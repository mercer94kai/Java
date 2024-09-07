package src.PracticeLab2024;

import java.util.Arrays;

public class maxProduct {
    public static void main(String[] args) {

        int[] arr={-100,-98,-1,2,3,4};
        System.out.println(maxProd(arr));
    }

    private static int maxProd(int[] nums) {

        Arrays.sort(nums);

        int n=nums.length;
        int res1=nums[n-1]+nums[n-2]+nums[n-3];
        int res2=nums[0]*nums[1]*nums[n-1];

        return Math.max(res1, res2);
    }
}
