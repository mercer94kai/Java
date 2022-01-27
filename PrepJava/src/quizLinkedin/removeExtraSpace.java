package quizLinkedin;

public class removeExtraSpace {

	public static void main(String[] args) {
		
		String str = "I  love  java  ,too  much ??";
		
		String nstr = str.trim().replaceAll(" +", " ");
		System.out.println(nstr);
	}

}
