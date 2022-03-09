package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Unfinished1 {

 
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("def","de","fgh"));
		List<String> list2 = new ArrayList<>(Arrays.asList("de","lmn","fgh"));
		matchingStrings(list, list2);
		
	}
	
	public static void matchingStrings(List<String> strings, List<String> queries) {
	    
	    HashMap<String, Integer> map = new HashMap<>();
	    List<Integer> list = new ArrayList<>();
	    
	    for (String s: queries){
	        map.put(s, 0);
	    }
	    
	    System.out.println(map);
	    
	    for (String i : strings){
	        if (map.containsKey(i)){
	            map.put(i, map.get(i)+1);
	        }
	    }
	    System.out.println(map);
	    for(String s : queries){
	        list.add(map.get(s));
	    }

	   System.out.println(list);
	    }

}
