package quizLinkedin;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		int p = scr.nextInt();
		
		for (int i=0 ; i <=p-1; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
