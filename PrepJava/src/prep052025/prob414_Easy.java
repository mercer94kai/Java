package prep052025;

import java.util.*;

public class prob414_Easy {
    public static void main(String[] args) {
        int[] nums={2,2,3,1};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {

        Set<Integer> set=new HashSet<>();

        for (int i:nums){
            set.add(i);
        }

        if(set.size()<3){
            return Collections.max(set);
        }
        set.remove(Collections.max(set));
        set.remove(Collections.max(set));
        return Collections.max(set);
    }
}
