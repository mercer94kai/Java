package quizLinkedin;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		System.out.print(a);
		System.out.print(b);
		
		for (int i= 2; i<n; i++) {
			sum=a+b;
			System.out.print(sum);
			a=b;
			b=sum;
		}
		
	}

}
