package PrepJava.src.interviewQues;

import java.util.Scanner;

public class PalingdromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		System.out.println("The Given String is pslingdrome? -->"+ isPalingdrome(str));
		System.out.println("The Given String is pslingdrome? -->"+ isPalingdrome(str,0,str.length()-1));
	}
	
	public static boolean isPalingdrome (String x) {
		
		String rev="";
		if (x==null) {
			return false;
		}
		else if (x.length()==1) {
			return true;
		}
		else {
			for (int i=0;i<x.length();i++) {
				char c = x.charAt(i);
				rev= c+rev;
			}
		}
		return (rev.equals(x))?true:false;
	}
	
	private static boolean isPalingdrome (String x, int l, int r) {
		
		if (l>=r) {
			return true;
		}
		else if (x.charAt(l) != x.charAt(r)) {
			return false;
		}
		else {
			return isPalingdrome(x, l+1, r-1);
		}
		
	}
		
}
