package prep052025;

import java.util.HashSet;
import java.util.Set;

public class prob219_Easy {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(containsNearbyDuplicate(nums,3));
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
