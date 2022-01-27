package quizLinkedin;

import java.util.Scanner;

public class palingdrome {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int k = n;
		int sum=0;
		
		while (n>0) {	
		sum=sum*10+(n%10);
		n=n/10;
		}
		
		System.out.println(sum);
		
		if (sum == k) {
			System.out.println(k +" No is palingdrome");
		}
		else {
			System.out.println(k +" No is not palingdrome");
		}
	}

}
