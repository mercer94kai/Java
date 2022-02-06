package hackerRank;

import java.util.ArrayList;

public class CeaserChiper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aXyBn90-mnABC";
		System.out.println(cesarCipher(str, 8));
		
	}
	
	public static String cesarCipher (String s , int r) {
		String res ="";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int rotate = r;
		int pos=0;
		ArrayList<Character> list = new ArrayList<>();
		for (int i =0; i<s.length(); i++) {
			int isPresent = 0;
			for (int j = 0; j<alp.length(); j++ ) { 
				int comapre = Character.compare(Character.toLowerCase(s.charAt(i)),alp.charAt(j)); 
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
				list.add(s.charAt(i));
			}			
			
		}
		
		for (int k =0; k< s.length() ;k++) {
			if (Character.isUpperCase(s.charAt(k))) {
				char c = Character.toUpperCase(list.get(k));
				res = res +c ;
			}
			else {
				res =res + list.get(k);
			}
		}
		
		return res;

	}

}
