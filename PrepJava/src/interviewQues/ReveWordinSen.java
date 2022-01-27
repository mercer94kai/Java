package interviewQues;

import java.util.Scanner;

public class ReveWordinSen {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split("\\s");
		String rev = "";
		for (String s : arr) {
			String r="";
			for (int i=0; i<s.length();i++) {
				char c = s.charAt(i);
				r = c+r;
			}
			rev=rev+r+" ";
		}
		
		System.out.println(rev);
	}
}
