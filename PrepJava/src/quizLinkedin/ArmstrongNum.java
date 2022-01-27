package quizLinkedin;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		int num = 432;
		double sum=0;
		int k=num;
		while (num>0) {
			sum = sum+Math.pow(num%10, 3);
			num=num/10;
		}
		
		if (sum==k) {
			System.out.println(k+" is an Armstrong Number");
		}
		else {
			System.out.println(k+" is not an Armstrong Number");
		}
	}

}
