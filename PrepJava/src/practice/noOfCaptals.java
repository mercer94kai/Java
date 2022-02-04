package practice;

public class noOfCaptals {

	public static void main(String[] args) {
		
		String str = "mYnameisKaifa$@1994";
/*		int Upper=0;
		int lower=0;
		int num=0;
		int spcl=0;
		
		for (int i=0; i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if (c>='a' && c<='z') {
				lower++;
			}
			else if (c>='A' && c<='Z') {
				Upper++;
			}
			else if (c>='0' && c<='9') {
				num++;
			}
			else {
				spcl++;
			}
		}
		System.out.println("Capitals "+ Upper);
		System.out.println("Lower "+lower);
		System.out.println("Number "+num);
		System.out.println("Special "+spcl);
*/
		
		for (int i=0; i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i)+" ");
			}
		}
	}

}
