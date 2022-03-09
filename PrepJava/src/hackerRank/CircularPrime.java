package hackerRank;

import java.util.ArrayList;

public class CircularPrime {

	public static void main(String[] args) {
		int sum=0;
		for (int i=0; i<=100;i++) {
			if(isElig(i)==true) {
				if (isCirPrime(i)==true) {
					System.out.print(i+" ");
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);

	}
	public static boolean isCirPrime(int n) {

		ArrayList<Integer> arr = new ArrayList<>();
		int r=0;
		int count=0;
		int temp=n;
		while(n>0) {
			r = n%10;
			n=n/10;
			count++;
		}
		n=temp;
		do  {
			r = n%10;
			n = n/10;
			n = (int) (r*Math.pow(10, count-1)+n);

			arr.add(n);
		}while(temp!=n);

		int rot=0;
		for (int k : arr) {
			if(isPrime(k)==true) {
				rot++;
			}
		}
		return (rot==arr.size())?true:false;

	}

	public static boolean isPrime(int n) {
		if (n==0||n==1) {
			return false;
		}
		else {
			for (int i=2; i<=n/2;i++) {
				if (n%i==0) {
					return false;
				}
			}
			return true;
		}
	}

	public static boolean isElig(int n) {

		ArrayList<Integer> a = new ArrayList<>();
		int[] b = {0,2,4,6,8,5};
		if (n == 2 || n==5) {
			return true;
		}
		else {
			while (n>0) {
				a.add(n%10);
				n=n/10;
			}
			for (int i: a) {
				for (int j : b) {
					if (i==j) {
						return false;
					}
				}
			}
			return true;
		}
	}
}