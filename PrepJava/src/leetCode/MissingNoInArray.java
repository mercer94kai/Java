package leetCode;

import java.util.Arrays;

public class MissingNoInArray {

	public static void main(String[] args) {
		
		int n=10;
		int[] arr = {6,1,2,8,3,4,7,10,5};
		System.out.println(MissingNumber(arr, n));
	}
	
	public static int MissingNumber(int array[], int n) {
		int missing=0;
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=i+1;
		}
		Arrays.sort(array);
		if (Arrays.equals(array, arr2)) {
			return 0;
		}
		else {
			for(int i=0;i<n;i++) {
				try {
					if (arr2[i]!=array[i]) {
						missing=arr2[i];
						break;
					}
				}
				catch(ArrayIndexOutOfBoundsException e) {
					missing=arr2[i];
				}
			}
		}
		return missing;
    }

}
