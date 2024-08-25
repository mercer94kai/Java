package src.PracticeLab2024;

import java.util.HashMap;

public class goodPAirs {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(gdPair(nums));
    }

    private static int gdPair(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int count=0;
        for (Integer e:map.values()){
            count+=numPair(e);
        }
        return count;
    }

    private static int numPair(Integer e) {

        if (e==0 || e==1){
            return 0;
        }
        else{
            return ((e-1)+numPair(e-1));
        }
    }
}
