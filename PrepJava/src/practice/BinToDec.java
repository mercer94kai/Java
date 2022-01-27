package practice;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		double d = 0;
		int i=0;
		while (b>0) {
			int r = b%10;
			d=d+r*Math.pow(2, i);
			i++;
			b=b/10;
		}
		
		System.out.println(d);
	}

}
