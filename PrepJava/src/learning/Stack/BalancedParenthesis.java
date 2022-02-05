package learning.Stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()}";
		System.out.println(IsBalanced(s));
	}
	
	public static boolean IsBalanced(String s) {
		
		Stack<Character> stc = new Stack<>();
		for (int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			if (isOpening(c)) {
				stc.push(c);
			}
			else {
				if (s.isEmpty()) {
					return false;
				}
				else if(!isMatching(stc.peek(), c)) {
					return false;
				}
				else {
					stc.pop();
				}
			} 
		}
		return stc.isEmpty();
	}
	public static boolean isOpening (char c) {
		
		return (c=='(' || c =='{' || c == '[')?true : false;
	}
	
	public static boolean isMatching (char a, char b) {
		
		return (a== '(' && b == ')' || a== '{' && b == '}'|| a== '[' && b == ']')?true:false;
	}

}
