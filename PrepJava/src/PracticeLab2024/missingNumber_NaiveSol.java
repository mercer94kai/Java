package src.PracticeLab2024;

import java.util.Arrays;

public class missingNumber_NaiveSol {
    public static void main(String[] args) {

        int[] nums={1};
        
        System.out.println(missNum(nums));
    }

    private static int missNum(int[] nums) {

        Arrays.sort(nums);
        int i=0;

        if (nums[0]!=0 && nums.length==1 ){
            return 0;
        }

        while(i<nums.length-1){
            if(nums[i+1]-nums[i]!=1){
                return i+1;
            }
            else{
                if (nums[0]!=0){
                    return 0;
                }
            }
            i++;
        }
        return nums.length;
    }
}
