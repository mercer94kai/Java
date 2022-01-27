package quizLinkedin;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseStringWOchangingSpacePositions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String rev="";
		char[] c = str.toCharArray();
		LinkedList<Character> ll = new LinkedList<>();
		
		for (int i= c.length-1; i>=0;i--) {
			if (c[i] != ' ') {
			ll.add(c[i]);
			}			
		}
		
		for (int i= 0; i<c.length;i++) {
			if (c[i] == ' ') {
			ll.add(i,c[i]);
			}			
		}
		
		for (Character ch : ll) {
			rev=rev+ch;
		}
		
		System.out.println(rev);
		
	}

}
