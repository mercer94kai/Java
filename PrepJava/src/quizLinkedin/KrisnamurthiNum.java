package quizLinkedin;

import java.util.Scanner;

public class KrisnamurthiNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k=num;
		double sum=0;
		while(num>0) {
			sum = sum+fact(num%10);
			num= num/10;
		}
		
		if (sum==k) {
			System.out.println(k+" is an Krisnamurthi Number");
		}
		else {
			System.out.println(k+" is not an Krishnamurthi Number");
		}
	}
	
	private static double fact(int a) {
		if (a==0) {
			return 1;
		}
		else {
			return a*fact(a-1);
		}
	}
}
