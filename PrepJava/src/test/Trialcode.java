package test;

public class Trialcode {
	public static void main(String[] args) {
	
		String s = "593";
		
		String str = "";
		int k=10;
	    while (k>0){
	        str = str+s;
	        k--;
	    }
		
		System.out.println(Rsum(s));
		
		
	}
	
	public static int Rsum(String s) {
		
		long num = Long.valueOf(s);
		
		if (num < 10) {
			return (int)num;
		}
		else{
			long sum=0;
			while (num>0) {
				sum=sum + (num%10);
				num=num/10;
			}
			return Rsum(String.valueOf(sum));
		}
	}
}