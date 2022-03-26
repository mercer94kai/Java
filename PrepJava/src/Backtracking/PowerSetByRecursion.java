package Backtracking;

public class PowerSetByRecursion {

	public static void main(String[] args) {


		String s = "abc";
		String curr="";
		powersSet(s,0,curr);
	}

	private static void powersSet(String s, int i, String curr) {

		if (i==s.length()) {
			System.out.print(curr+" ");
			return;
		}
		powersSet(s, i+1, curr+s.charAt(i));
		powersSet(s, i+1, curr);
	}

}
