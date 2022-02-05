package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
//	[256741038, 623958417, 467905213, 714532089, 938071625]
//	[256741038, 467905213, 623958417, 714532089, 938071625]
//	2063136757 2744467344

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(7,2,69,211,898));
		miniMaxSum(li);
	}
	
	public static void miniMaxSum(List<Integer> arr) {

		int min = arr.get(0);
		int max =arr.get(0);
		long total =0;
		 for (int i=0; i< arr.size() ;i++){
			   	if (min> arr.get(i)) {
			   		min = arr.get(i);
			   	}
			   	if (max < arr.get(i)) {
			   		max = arr.get(i);
			   	}
		        
			   	total = total + arr.get(i);
	    }
		 System.out.format("%d %d",total-max,total-min);

	    }

}
