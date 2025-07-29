package Training102023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class testSome {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,4,6};
        int k=2;
        System.out.println(kdiff(nums,k));
    }

    private static int kdiff(int[] nums, int k) {

        int res=0;
        Set<Integer> set= new HashSet<>();

        for (int i:nums){
            set.add(i);
        }

        for (int i:nums){
            if(set.contains(i+k)){
                res++;
            }
        }
        return res;
    }
}
