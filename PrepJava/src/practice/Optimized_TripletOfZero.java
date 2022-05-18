package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Optimized_TripletOfZero {

	public static void main(String[] args) {
		
		int[] arr = {0,-1,2,-3,1};
		int flag=0;
		for (int i=0;i<arr.length-1;i++) {
			ArrayList<Integer>  alist = new ArrayList<>();
			for (int j=i+1;j<arr.length;j++) {
				HashSet<Integer> set = new HashSet<>();
				int temp=-(arr[i]+arr[j]);
				if (alist.contains(temp)) {
					set.addAll(Arrays.asList(arr[i],arr[j],temp));
					flag=1;
					System.out.println(set);
					break;
				}
				else {
					alist.add(arr[j]);
				}
			}
		}
		if (flag==0) {
			System.out.println("No triplets present");
		}

	}

}
