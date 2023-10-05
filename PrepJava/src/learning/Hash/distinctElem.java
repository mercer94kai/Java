package learning.Hash;

import java.util.HashSet;
import java.util.Set;

public class distinctElem {

	public static void main(String[] args) {

		int[] arr = {5,10,4,5,10,5,9};
		
		Set<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}

		System.out.println(set);
		System.out.println("No of Distict Elem: "+set.size());
	}

}
