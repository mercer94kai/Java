package interviewQues;

import java.util.HashMap;

public class FindDuplicateChar {

	public static void main(String[] args) {
		
		String str = "kafka";
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] arr = str.split("");
		for (String s : arr ) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
			map.put(s, 1);
			}
		}
		for (String s : map.keySet()) {
			if (map.get(s)>1) {
				System.out.println("The Duplicate Char : "+s);
			}
		}
		
	}	

}
