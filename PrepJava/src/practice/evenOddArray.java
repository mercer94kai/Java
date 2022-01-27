package practice;

import java.util.ArrayList;
import java.util.List;

public class evenOddArray {

	public static void main(String[] args) {
		
		int[] arr = {2,4,3,8,12,19,11};
		List<Integer> evenArrlst = new ArrayList<>() ;
		List<Integer> oddArrlst = new ArrayList<>() ;
		for (int i : arr) {
			if (i%2==0) {
				evenArrlst.add(i);
			}
			else {
				oddArrlst.add(i);
			}
		}
		System.out.println(evenArrlst.size()+" "+oddArrlst.size());
		for (int j : evenArrlst) {
			System.out.print(j+" ");
		}
		System.out.println("");
		for (int j : oddArrlst) {
			System.out.print(j+" ");
		}
		
	}

}
