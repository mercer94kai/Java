package practice;

public class swapNumber {

	public static void main(String[] args) {
		
		int a = 132;
		int b = 112;
		//int temp = 0;
		System.out.println(a+" "+b);
		//temp=b;
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println(a+" "+b);
	}

}
