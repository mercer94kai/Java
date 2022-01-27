package practice;

import java.util.Scanner;

public class ReplaceByX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String ptr = sc.nextLine();
		
		System.out.println(str.replaceAll(ptr, "X"));
	}

}
