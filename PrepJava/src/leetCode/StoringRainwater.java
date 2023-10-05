package PrepJava.src.leetCode;

public class StoringRainwater {
		//3,1,2,4,0,1,3,2
		//1,2,1,3,1,1,0,4,2,1,2
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,4,0,1,3,2};
		int totalrain=0;
		for (int i = 0; i<arr.length;i++) {
			int leftbig=0;
			int rightbig=0;
			for (int j = 0 ; j<i; j++ ) {
				if (leftbig<arr[j]) {
					leftbig = arr[j];
				}
			}
			for (int k = i+1 ; k<arr.length; k++ ) {
				if (rightbig<arr[k]) {
					rightbig = arr[k];
				}
			}
			
			if (Math.min(leftbig, rightbig)-arr[i]>0) {
				totalrain = totalrain + (Math.min(leftbig, rightbig)-arr[i]);
			}
		}
		
		System.out.println(totalrain);

	}

}
//====================================================
//if (leftbig >= rightbig) {
//if((rightbig -arr[i])>0) {
//	totalrain = totalrain+(rightbig - arr[i]);
//}
//}
//else {
//if((leftbig -arr[i])>0) {
//	totalrain = totalrain+(leftbig - arr[i]);
//}
//}
