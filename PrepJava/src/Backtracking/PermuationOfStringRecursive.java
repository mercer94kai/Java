package Backtracking;

public class PermuationOfStringRecursive {

public static void main(String[] args) {
		
		String str="abc";
		permute(str, 0, str.length()-1);
	}
	public static void permute (String s, int l, int r) {
		if (l==r) {
			System.out.print(s+" ");
			return;
		}
		for (int i=l;i<=r;i++) {
			s=swap(s, l, i);
			permute(s, l+1, r);
			s=swap(s, l, i);
		}
	}
	
	private static String swap(String s, int l, int r ) {
		char[] ch = s.toCharArray();
		char c;
		c=ch[l];
		ch[l]=ch[r];
		ch[r]=c;
		return new String(ch);
	}}
