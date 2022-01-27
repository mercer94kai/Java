package learning.Hash;

import java.util.HashSet;
import java.util.Set;

public class unionOfArrays {

	public static void main(String[] args) {
		
		int[] ar1 = {5,10,15,5};
		int[] ar2 = {10,15,4,5};
		
		Set<Integer> set = new HashSet<>();
		
		for (Integer i : ar1  ) {
			set.add(i);
		}
		
		for (Integer j : ar2  ) {
			set.add(j);
		}
		
		System.out.println(set);
		System.out.println(set.size());
	}

}
