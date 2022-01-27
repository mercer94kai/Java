package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		
		 int[] unsortedArr = {100,33,11,55,43,6,11,65,33,23};
		//String[] arr = {"AA","BB","BB","CGF","NN","CGF","XYZ"};
		//ArrayList<String> arr = new ArrayList<>(Arrays.asList("AA","BB","BB","CGF","NN","CGF","XYZ"));
		//ArrayList<Integer> unsortedArr = new ArrayList<>(Arrays.asList(100,33,11,55,43,6,11,65,33,23));
		int size = unsortedArr.length;
		Set<Integer> set = new HashSet<Integer>();
		//Collections.addAll(set, unsortedArr);
		
		//set.addAll(unsortedArr);
		
//		ArrayList<Integer> sortedArr = new ArrayList<>(set);
//		Collections.sort(sortedArr);
		Arrays.sort(unsortedArr);
		for (int i : unsortedArr) {
			System.out.print(i+" ");
		}
		System.out.println("");
		System.out.println(unsortedArr[--size]);
		System.out.println(unsortedArr[--size]);
		
		//System.out.println(sortedArr);
		//System.out.println("Minimum Val:"+Collections.min(sortedArr)+" && Maximum Val:"+Collections.max(sortedArr) );
		
	}

}
