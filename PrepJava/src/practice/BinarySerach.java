package practice;

import java.util.Scanner;

public class BinarySerach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag = 0,index = 0;
		int arr[] = new int[n];
		for (int i=0 ;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println("");
		int k=sc.nextInt();
		
		for (int i =0 ; i<n; i++) {
			if (arr[i]==k) {
				flag=1;
				index=i;
				break;
			}
		}
		if (flag==1) {
			System.out.println("Index of "+k+" is "+index);
		}
		else {
			System.out.println(k+" is not present in Array");
		}
		
	}

}
