package interviewQues;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "I love java java very much much ";
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] arr = str.split("\\s");
		for (String s : arr ) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
			map.put(s, 1);
			}
		}
		
		System.out.println(map);
		
	}

}