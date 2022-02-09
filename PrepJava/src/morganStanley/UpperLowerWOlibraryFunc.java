package morganStanley;

public class UpperLowerWOlibraryFunc {

	public static void main(String[] args) {
		
		String str = "myNameIsKaifaMandal";
		
		System.out.println(to_lowerCase(str));
		System.out.println(to_upperCase(str));
	
	}

	private static String to_lowerCase(String str) {
		
		char[] ch = str.toCharArray();
		
		for (int i=0; i< ch.length; i++) {
			
			if (ch[i]>=65 && ch[i]<= 96) {
				ch[i]+= 32;
			}
			
		}
		
		return new String(ch);
		
	}

	private static String to_upperCase(String str) {
		char[] ch = str.toCharArray();
		
		for (int i=0; i< ch.length; i++) {
			
			if (ch[i]>= 97 && ch[i]<= 123) {
				ch[i]-=32;
			}
		}
		return new String(ch);
	}

}
