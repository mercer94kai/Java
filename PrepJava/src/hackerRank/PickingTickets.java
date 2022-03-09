package hackerRank;

import java.util.Arrays;
import java.util.List;

public class PickingTickets {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,1,2};
		int[] c = countingSort(arr);
		
		int big = 0;
		
		for (int i=0;i<c.length-1;i++) {			
			if (c[i]+c[i+1]>big) {
				big = c[i]+c[i+1];
			}
		}
		
		System.out.println(big);
		
	}
	
	public static int[] countingSort(int[] a) {
		int[] arr = new int[10]; 
		for (int i : a) {
			for (int j =0 ; j<arr.length; j++) {
				if (i==j) {
					arr[j]=arr[j]+1;
				}	
			}
		}
		return arr;
	}

}
