package prep052025;

import java.util.HashSet;
import java.util.Set;

public class prob217_Easy {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int a:nums){
            if(!set.add(a)){
                return true;
            }
        }
        return false;
    }
}
