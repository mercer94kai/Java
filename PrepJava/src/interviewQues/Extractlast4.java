package interviewQues;

import java.util.Scanner;

public class Extractlast4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		System.out.println(str.substring(str.length()-4, str.length()));
		//in substring method the beginning index is inclusive
		//in substring method the ending index is exclusive
	}
}
