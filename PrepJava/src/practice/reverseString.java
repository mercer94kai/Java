package practice;

public class reverseString {

	public static void main(String[] args) {
	
		
		String str = "i.like.java.coding.so.much";
		String rev = "";
		String[] arr = str.split("\\.");
		
		for (String s : arr) {
			rev = s+"."+rev;
		}
		System.out.println(rev.substring(0, rev.length()-1));
		
		/*
		String str = "i.like.java.coding.so.much";
		String rev = "";
		for (int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			rev = c+rev;
		}
		System.out.println(rev);
		*/
	}
}
