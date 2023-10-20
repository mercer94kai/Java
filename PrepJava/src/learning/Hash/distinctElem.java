package PrepJava.src.learning.Hash;

import java.util.HashSet;
import java.util.Set;

public class distinctElem {

	public static void main(String[] args) {

		int[] arr = {1,1,2};
		
		Set<Integer> set = new HashSet<>();
		for (Integer i : arr) {
			set.add(i);
		}

		for (Integer i : set) {
			System.out.println(i);
		}
//		System.out.println(set);
//		System.out.println("No of Distict Elem: "+set.size());
	}

}
