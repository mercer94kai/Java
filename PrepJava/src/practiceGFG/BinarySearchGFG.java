package practiceGFG;

public class BinarySearchGFG {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		System.out.println(binaryserch(arr, 5, 3));
		
	}
	
	private static int binaryserch(int[] arr, int n, int k) {
		
		return index(arr,0,n-1,k);
	}

//	private static int index(int[] arr, int l, int r, int k) {
//		
//		int mid=(l+r)/2;
//		
//		if (l<=r) {
//			if (k==arr[mid]) {
//				return mid;
//			}
//			else if (k<arr[mid]) {
//				return index(arr,l,mid-1,k);
//			}
//			else {
//				return index(arr,mid+1,r,k);
//			}
//		}
//		return -1;
//		
//	}
	
private static int index(int[] arr, int l, int r, int k) {
		
		
		while (l<=r) {
			int mid=(l+r)/2;
			if (k==arr[mid]) {
				return mid;
			}
			else if (k<arr[mid]) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
		
	}

}
