package quizLinkedin;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		
		for (int i=0; i<arr.length-1;i++) {
			boolean isSwaped=false;

			for (int j=0; j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					isSwaped=true;
					swap(arr,j,j+1);
				}
			}
			
			if (!isSwaped) {
				System.out.println("No swap required");
				break;
			}
		}
		
		for (int r : arr) {
			System.out.print(r+" ");
		}
		

	}
	
	private static void swap (int[] arr, int i, int j) {
		 if (i == j) {
	            return;
	        }
		 
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	}
}
