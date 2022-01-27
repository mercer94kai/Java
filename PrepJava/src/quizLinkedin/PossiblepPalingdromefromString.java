package quizLinkedin;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PossiblepPalingdromefromString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		findPosssiblepalingdromes(str);
	}
	
	private static void findPosssiblepalingdromes(String str) {
		
		if (str==null) {
			System.out.println("String is null");
		}
		
		Set<String> set = new HashSet<>();
		
		for (int i = 0; i<str.length();i++) {
			expand(str, i, i, set);
			expand(str, i, i+1, set);
		}
		System.out.println(set);
	}

	public static void expand(String str, int low, int high, Set<String> set) {
		
		while (low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)) {
			set.add(str.substring(low, high+1));
			low--;
			high++;
		}
	}
}
