package practiceGFG;

import java.util.ArrayList;

public class CommonElemGFG {

	public static void main(String[] args) {

		
		int[] a = {1, 5, 10, 20, 40, 80};
		int[] b = {6, 7, 20, 80, 100};
		int[] c = {3, 4, 15, 20, 30, 70, 80, 120};
		
		System.out.println(commonElem(a,b,c));

	}

	private static ArrayList<Integer> commonElem(int[] a, int[] b, int[] c) {
		
		ArrayList<Integer> res= new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			if (binSer(b,a[i]) && binSer(c,a[i]) && !res.contains(a[i])) {
				res.add(a[i]);
			}
		}
		
		return res;
	}

	private static boolean binSer(int[] arr, int i) {

		int l=0,r=arr.length-1;
		
		while (l<=r) {
			int mid=(l+r)/2;
			if (i==arr[mid]) {
				return true;
			}
			else if (i<arr[mid]) {
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		
		return false;
	}
	
}
