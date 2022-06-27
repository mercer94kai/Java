package practiceGFG;

import java.util.HashSet;
import java.util.Set;

public class UnionOfArraysGFG {

	public static void main(String[] args) {
		
		int[] a= {85,25,1,32,54,6};
		int[] b= {85,2};
		
		int i=0,j=0;
		Set<Integer> set = new HashSet<Integer>();
		
		while (i<a.length) {
			set.add(a[i]);
			i++;
		}
		while (j<b.length) {
			set.add(b[j]);
			j++;
		}
		
		System.out.println(set.size());
	}

}
