package test;

import java.util.ArrayList;

public class Trialcode {
	public static void main(String[] args) {
		
		String str = "1xy-V9z";
		String res ="";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int rotate = 27;
		int pos=0;
		ArrayList<Character> list = new ArrayList<>();
		for (int i =0; i<str.length(); i++) {
			int isPresent = 0;
			for (int j = 0; j<alp.length(); j++ ) { 
				int comapre = Character.compare(Character.toLowerCase(str.charAt(i)),alp.charAt(j)); 
				if (comapre == 0) {
					isPresent = 1;
					pos = j+rotate;
					if (pos > 25) {
						while (pos > 25) {
						pos= Math.abs(26-pos);
						}
						list.add(alp.charAt(pos));
					}
					else {
						list.add(alp.charAt(pos));
					}
				}
			}
			if (isPresent == 0) {
				list.add(str.charAt(i));
			}			
			
		}
		
		for (int k =0; k< str.length() ;k++) {
			if (Character.isUpperCase(str.charAt(k))) {
				char c = Character.toUpperCase(list.get(k));
				res = res +c ;
			}
			else {
				res =res + list.get(k);
			}
		}
		
		System.out.println(res);
	 }
	
}
