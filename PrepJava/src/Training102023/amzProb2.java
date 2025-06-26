package Training102023;

import java.util.Arrays;
/*
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
 */

import static Revesion2023.DAY4.bubbleSort.swap;

public class amzProb2 {
    public static void main(String[] args) {
        int[] nums={1, 2, 0, 4, 3, 0, 5, 0};

        for (int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j+1]>nums[j] && nums[j]==0){
                    swap(nums,j+1,j);
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
