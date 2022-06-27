package practiceGFG;

import java.util.Arrays;

public class RotateArrayGFG {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		
		rotateArr(arr,2,arr.length);
		System.out.println(Arrays.toString(arr));
}
	
	private static void rotateArr(int[] arr, int d, int n) {
		
	reverse(arr,0,n-1);
	reverse(arr,0,n-d-1);
	reverse(arr,n-d,n-1);
	}

	private static void reverse(int[] arr, int i, int j) {
		
		while(i<=j) {
			swap(arr,i,j);
			i++;
			j--;
		}
	}

	private static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
