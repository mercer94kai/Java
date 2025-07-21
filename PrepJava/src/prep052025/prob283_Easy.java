package prep052025;

import java.util.Arrays;

import static Revesion2023.DAY4.bubbleSort.swap;

public class prob283_Easy {
    public static void main(String[] args) {

        int[] nums={4,2,4,0,0,3,0,5,1,0};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveZeroes(int[] nums) {

        int pos=0;

        for (int i:nums){
            if(i!=0){
                nums[pos++]=i;
            }
        }
        while(pos<nums.length){
            nums[pos++]=0;
        }

    }
}
