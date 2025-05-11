package src.prep052025;

import java.util.Arrays;

public class prob_1985Mid_Naiv {
    public static void main(String[] args) {

        String[] nums={"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
        System.out.println(klarElem(nums,1));
        System.out.println(Arrays.toString(nums));
    }

    private static String klarElem(String[] nums, int k) {
        quicksort(nums,0,nums.length-1);
        return nums[k-1];
    }

    private static void quicksort(String[] nums, int low, int high) {

        if(low<high){
            int pivot=partn(nums,low,high);
            quicksort(nums,0,pivot-1);
            quicksort(nums,pivot+1,high);
        }
    }

    private static int partn(String[] nums, int low, int high) {

        Long pivot=Long.valueOf(nums[low]);
        int i=low;int j=high;
        while(i<j){
         while(i<=high && Double.parseDouble(nums[i])>=pivot){
             i++;
         }
         while (Long.parseLong(nums[j])<pivot){
             j--;
         }
         if(i<j){
             swaping(nums,i,j);
         }
        }
        swaping(nums,j,low);
        return j;
    }

    private static void swaping(String[] nums, int i, int j) {
        if(i==j){
            return;
        }
        String str=nums[i];
        nums[i]=nums[j];
        nums[j]=str;
    }
}
