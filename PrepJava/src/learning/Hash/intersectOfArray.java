package learning.Hash;

import java.util.HashSet;
import java.util.Set;

public class intersectOfArray {

	public static void main(String[] args) {
		
		int[] arr1 = {5,10,15,10};
		int[] arr2 = {15,10,4};
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (Integer i : arr1) {
			set.add(i);
		}
		
		for (Integer j : arr2) {
			if (set.contains(j)) {
				set.remove(j);
				set2.add(j);
			}
		}
		System.out.println(set2);
		System.out.println(set2.size());
	}
}


