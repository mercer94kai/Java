package test;

import java.util.ArrayList;
import java.util.List;

public class Trialcode {
	
//	123
//	1111011
	public static void main(String[] args) {
		
		int n = 123;
		int sum =0;
		while (n>0) {
			sum = sum + (n%2)*10;
			n=n/2;
		}
		System.out.println(sum);
				
	}
}
