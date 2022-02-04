package learning.Hash;

//  {10,15,-5,15,-10,5}
// sum = 20
import java.util.HashMap;

public class subarrayOfSum {

	public static void main(String[] args) {
		
		int[] arr1 = {2,7,11,15};
		
		int curSum = 0; 
		int sum = 9; 
		int start = 0;
		int end = -1;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i=0; i<arr1.length-1; i++) {
			
			curSum = curSum+arr1[i];
			if (curSum == sum) {
				start = 0; end =i;
				break;
			}
			
			if (map.containsKey(curSum-sum)) {
				start = map.get(curSum-sum)+1;
				end = i;
				break;
			}
			map.put(curSum, i);
		}
		
		if (end == -1) {
			System.out.println("Subarray not found");
		}
		else {
			//System.out.println("Sub Array"+ arr1[start]+","+arr1[end]);
			for (int k= start; k<= end; k++) {
				System.out.print(arr1[k]+" ");
			}
			
		}
	}

}
