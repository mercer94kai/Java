package quizLinkedin;

import java.util.Scanner;

public class FibonnaciSumRecursion {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		System.out.println(fib(n));
		
	}
	
	public static int fib (int x) {
		
		if (x==0 || x==1) {
			return x;
		}
		else {
			 return fib (x-1)+ fib (x-2) ;
		}
	}
}
