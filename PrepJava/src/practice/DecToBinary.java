package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		while (n>0) {
			list.add(n%2);
			n=n/2;
		}
		for (int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i));
		}
	}

}
