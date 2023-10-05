package practice;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		System.out.println(gcd(12, 32));
		System.out.println(lcm(54,24));
	}
	
	public static int gcd(int x, int y) {
		if (y==0) {
			return x;
		}
		else {
			return gcd(y, x%y);
		}
	}
	
	public static int lcm(int x, int y) {
		
		return (x/gcd(x,y))*y;
	}
	
}

