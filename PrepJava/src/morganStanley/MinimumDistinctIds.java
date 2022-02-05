package morganStanley;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumDistinctIds {

	public static void main(String[] args) {
		
		int[] num = { 2, 4, 1, 5, 3, 5, 1, 3};
		int m =2;
		distinctID(num, m);
	}
	
	public static void distinctID(int[] a, int m) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer i : a ) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
			map.put(i, 1);
			}
		}
		ArrayList<Integer> alist = new ArrayList<>();
		ArrayList<Integer> alist2 = new ArrayList<>();
		for (Integer k : map.keySet()) {
			if (m>0) {
				if (map.get(k)<m) {
					m = m-map.get(k);
					alist.add(k);
				}else if (map.get(k)==m) {
					m = m-map.get(k);
					alist2.add(k);
				}
				
			}
		}
		System.out.println(map);
		System.out.println(alist);
		System.out.println(alist2);
	}
	

}
