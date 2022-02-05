package morganStanley;

import java.util.Arrays;

public class OddtoEven {
	
	public static void main(String[] args) {
		String s = "536425";
		makeEven(s);
	}
	
	public static void makeEven(String s) {
		char[] cr = s.toCharArray();
		int last = cr.length-1;
		int lstEven =0;
		int flag =0;
		String ans ="";
		if (val(cr[last])%2!=0) {
			for (int i=0; i<s.length()-1; i++) {
				if (val(cr[last])>val(cr[i]) && val(cr[i])%2==0) {
					lstEven = i;
					break;
				}
				else if (val(cr[last])<val(s.charAt(i)) && val(s.charAt(i))%2==0) {
					 lstEven = i;
				}
				else if (val(s.charAt(i))%2!=0) {
					flag++;
				}
			}
		}
		else {
			System.out.println("It's aleady a even no");
		}
		
		if (++flag == cr.length) {
			System.out.println(s);
		}
		else {
			swap (cr,lstEven,last);
			for (char c : cr) {
				ans = ans +c; 			
				}
			System.out.println(ans);
		}
	
	}
	
	public static int val(char c) {
		return Integer.parseInt(String.valueOf(c));
	}
	
	public static void swap (char[] c, int i , int j) {
		char temp =c[i];
		c[i] = c[j];
		c[j] = temp;
	}
}
