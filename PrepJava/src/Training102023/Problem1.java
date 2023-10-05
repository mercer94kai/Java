package Training102023;

import java.util.HashMap;

//Q: Two's Sum
public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){
                int[] arr = {map.get(target-nums[i]),i};
                return arr;
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
