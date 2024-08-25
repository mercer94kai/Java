package src.PracticeLab2024;

import java.util.Arrays;

public class missingNumberOpt {


        public static void main(String[] args) {

            int[] nums={9,6,4,2,3,5,7,0,1};

            System.out.println(miNum(nums));
        }

    private static int miNum(int[] nums) {

        Arrays.sort(nums);

        int i=0;
        while(i< nums.length){
            if(i!=nums[i]){
                return i;
            }
            i++;
        }
      return nums.length;
    }

}


