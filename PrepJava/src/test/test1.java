package test;

public class test1 {

//	String = i.like.this.program.very.much
//			Output: much.very.program.this.like.i

	public static void main(String[] args) {

		String s1 = "i.like.this.program.very.much";
		int len = s1.length();
		String rev="";
		char ch;
		
		for (int i=0; i<len;i++) {
			
			ch=s1.charAt(i);
			
			rev=ch+rev;
		}

		System.out.println(rev);
}
}
