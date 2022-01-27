package quizLinkedin;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int p = scr.nextInt();
		
		for (int i=0 ; i <=p-1; i++) {
			for (int k=0; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j=p-i-1; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
