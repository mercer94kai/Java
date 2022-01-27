package practice;

import java.util.HashMap;

public class pracTest {

	public static void main(String[] args) {
		
		String str = "I am am learning java java";
		HashMap<String, Integer> hm = new HashMap<>();
		
		String[] strArr = str.split("\\s");
		
		for (String s : strArr) {
			
			if (hm.get(s)!= null) {
				
				hm.put(s, hm.get(s)+1);
			}
			else {
			hm.put(s, 1);
			}
		}
		
		System.out.println(hm.size());
	}

}
