package test;

public class hh {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
        String[] arrOfStr = str.split("\\.");
        String s=".";
        String rev="";
        
        for (int i=arrOfStr.length-1; i>=0; i--) {
        	
        	rev=rev+arrOfStr[i]+s;
        }
        
        System.out.println(rev);
	}

}
