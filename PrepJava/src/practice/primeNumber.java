package practice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();

		for (int i=0; i<=num; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isprime(int n) {

		if (n ==0 || n==1) {

			return false;
		}
		else {
			for (int j=2; j<=n/2;j++) {
				if (n%j==0) {
					return false;
				}
			}
			return true;
		}
	}

}
