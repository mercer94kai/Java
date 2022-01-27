package quizLinkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr = {7,3,5,1,24};
		List<Integer> list = new ArrayList<>();
		int d= 2;
		
		for (int i=d; i<arr.length;i++) {
			
			 list.add(arr[i]);
		}
		for (int i=0; i<d;i++) {
			list.add(arr[i]);
		}
		
		System.out.println(list);
	}

}
