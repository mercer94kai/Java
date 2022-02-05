package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>(Arrays.asList(3,1,1,1,4,5,9));
		countingSort(li);
		}
	
	public static void countingSort(List<Integer> li) {
		int[] arr = new int[10]; 
		for (Integer i : li) {
			for (int j =0 ; j<arr.length; j++) {
				if (i==j) {
					arr[j]=arr[j]+1;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
