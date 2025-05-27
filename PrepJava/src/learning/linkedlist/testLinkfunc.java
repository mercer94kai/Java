package learning.linkedlist;

import java.util.*;

public class testLinkfunc {

	public static void main(String[] args) {

		int[] nums={-1,3,2,4,5};

		System.out.println(maximumSubarraySum(nums, 3));

	}

	public static long maximumSubarraySum(int[] nums, int k) {

		HashMap<Integer,Long> prefMap= new HashMap<>();
		long maxVal=Long.MIN_VALUE;
		long preficsum=0;

		for (int i=0;i<nums.length;i++){
			if (prefMap.getOrDefault(nums[i],Long.MAX_VALUE)>preficsum){
				prefMap.put(nums[i],preficsum);
			}
			preficsum+=nums[i];

			if (prefMap.containsKey(nums[i]+k)){
				maxVal=Math.max(maxVal, preficsum-prefMap.get(nums[i]+k));
			}

			if (prefMap.containsKey(nums[i]-k)) {
				maxVal = Math.max(maxVal, preficsum - prefMap.get(nums[i] - k));
			}
		}
		return maxVal==Long.MIN_VALUE?0:maxVal;
	}
}
