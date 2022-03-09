package test;

import java.util.ArrayList;

public class hh {

	public static void main(String[] args) {
		int n = 4657;
		ArrayList<Integer> arr = new ArrayList<>();
		int r=0;
		int count=0;
		int temp=n;
		while(n>0) {
			r = n%10;
			n=n/10;
			count++;
		}
		System.out.println(count);
		n=temp;
		do  {
			r = n%10;
			n = n/10;
			n = (int) (r*Math.pow(10, count-1)+n);
			arr.add(n);
		}while(temp!=n);
		
		System.out.println(arr);
	}

}
