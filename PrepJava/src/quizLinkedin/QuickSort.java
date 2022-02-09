package quizLinkedin;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {0,1,2,4,6,5,3};
		quickSort(arr, 0, arr.length-1);
		int median = 0;
		if (arr.length%2==0) {
			median = arr.length/2;
		}
		else {
			median = arr.length/2+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[median -1]);
	}
	
	public static void quickSort(int[] a , int low, int high) {
		
		if (low < high) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot-1);
			quickSort(a,pivot+1, high);
		}
	}
	
	public static int partition(int[] a,int low, int high) {
		int pivot = a[low];
		int i=low; int j=high;
		
		while (i<j) {
			while (a[i]<=pivot) {
				i++;
			}
			while (a[j]> pivot){
				j--;
			}
			if (i<j) {
				swap(a, i, j);
			}
		}
		swap(a, j, low);
		return j;
	}
	
	public static void swap (int[] a, int x , int y) {
		
		if (x==y) {
			return;
		}
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
