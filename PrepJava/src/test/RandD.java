package test;

public class RandD {

	public static void main(String[] args) {
	
		String str = "[()][{()}]";
		
		char[] ch = str.toCharArray();
		int count_1=0;
		int count_2=0;
		int count_3=0;
		
		for (char c : ch) {
			if (c == '(') {
				count_1++;
			}
			else if (c == '{') {
				count_2++;
			}else if (c == '[') {
				count_3++;		
			}
			if (c == returnclosing('(')) {
				count_1--;
			}
			else if (c == returnclosing('{')) {
				count_2--;
			}else if (c == returnclosing('[')) {
				count_3--;		
			}
		}
		
		if (count_1 == 0 && count_2 == 0 && count_3 == 0 ) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not balance");
		}
		
		
	}
	
	private static char returnclosing(char c) {
		
		if (c == '(') {
			return ')';
		}
		else if (c == '{') {
			return '}';
		}else if (c == '[') {
			return ']';		
		}
		else {
		return ' ';
		}
	}
}