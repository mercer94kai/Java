package codility;

import java.util.HashMap;

public class Seasons {

	public static void main(String[] args) {
		
		int[] t = {-3,14,-7,-5,7,8,42,8,3,3,-10,6};
		int high_amp=0;
		int season=0;
		int res=0;
		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, "WINTER");
		map.put(1, "SPRING");
		map.put(2, "SUMMER");
		map.put(3, "AUTUMN");
		
		int cap = t.length/4;
		int i=0;		
		while (i<t.length) {
			int small=t[0]; 
			int big=t[0];
			for (int k=i; k<i+cap;k++) {
			if (small>t[k]) {
				small = t[k];
			}
			if (big<t[k]) {
				big = t[k];
			}
			}
			
			if (high_amp< Math.abs(big-small)) {
				high_amp = Math.abs(big-small);	
				res=season;
			}
			i= i+cap;
			season++;
		}
		
		System.out.println(map.get(res));
	}

}
