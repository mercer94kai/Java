package interviewQues;

public class EquilibriumPoint {

	public static void main(String[] args) {
		long[] arr = {1,2};
		System.out.println(equilPoint(arr));
	}
	
	public static long equilPoint(long[] arr) {
		long lsum=0;
		long rsum=0;
		for (int i=0;i<arr.length;i++) {
			rsum += arr[i];
		}
		for (int i=0;i<arr.length;i++) {
			rsum -= arr[i];
			if (lsum==rsum) {
				return i+1;
			}
			else {
				lsum+=arr[i];
			}
		}
		return -1;
	}

}
