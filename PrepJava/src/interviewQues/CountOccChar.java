package interviewQues;

public class CountOccChar {

	public static void main(String[] args) {
		
		String str = "Java is object oriented language";
		String[] arr = str.split("");
		int count=0;
		
		for (String s : arr) {
			if (s.equals("a")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
