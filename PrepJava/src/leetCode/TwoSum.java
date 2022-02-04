package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2,7,11,15};
		int target = 13;
		
		System.out.println(Arrays.toString(twoSum(arr, target)));
	}
	
	 public static int[] twoSum(int[] nums, int target) {
		    
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<nums.length;i++) {
			int reqNum = (target - nums[i]);
			if (map.containsKey(reqNum)) {
				int[] returnArr ={map.get(reqNum),i};
				return returnArr;
			}
			map.put(nums[i], i);
		}
		return null;
	 }

}
