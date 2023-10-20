package PrepJava.src.learning.Hash;

//  {10,15,-5,15,-10,5}
// sum = 20
import java.util.HashMap;

public class subarrayOfSum {

	public static void main(String[] args) {
		
		//int[] arr1 = {2,11,6,4,20,15,9,22};
		int[] arr1 = {1,2,3,7,5};
		//int[] arr1 = {10,15,-5,15,-10,5};
		
		int curSum = 0; 
		int sum =12;
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
