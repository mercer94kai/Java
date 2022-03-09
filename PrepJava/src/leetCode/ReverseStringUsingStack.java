package leetCode;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void main (String[] args) {
		
		String s = "i love java";
		
		revwStc(s);
	}

	public static void revwStc(String s) {
		
		Stack<Character> stc = new Stack<>();
		String res="";
		for (int i=0; i<s.length();i++) {
			stc.push(s.charAt(i));
		}
		
		while (stc.isEmpty()!=true) {
			res = res + stc.pop();
		}
		
		System.out.println(res);
	}
	
	

}
