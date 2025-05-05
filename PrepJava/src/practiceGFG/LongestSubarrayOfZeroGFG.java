package practiceGFG;

import java.util.HashMap;
//subarray sum with negetive e lem
public class LongestSubarrayOfZeroGFG {

	public static void main(String[] args) {
		int[] arr = {1,-1,1,-1,1};

		longestSubzero(arr);

	}

	private static void longestSubzero(int[] arr) {

		int curSum=0; 
		int max_len=0;

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);

		for (int i=0; i<arr.length; i++) {
			curSum +=arr[i];

			if (!map.containsKey(curSum)) {
				map.put(curSum, i);
			}
			else {
				int idx=map.get(curSum);
				max_len=Math.max(max_len,i-idx);
			}

		}

		System.out.println(max_len);
		System.out.println(map);
	}	

}
