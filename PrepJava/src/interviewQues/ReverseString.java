package interviewQues;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev="";
		
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			rev= c+rev;
		}
		System.out.println(rev);
	}

}
