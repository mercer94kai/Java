package PrepJava.src.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] str = {"kaifa","kafka","kaiya", "kaif"};
		System.out.println(lcp(str));
	}

	private static String lcp(String[] str) {

		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		int i;
		for (i=0;i< str[0].length(); i++) {
			if (str[0].charAt(i)==str[str.length-1].charAt(i)) {
				continue;
			}
			break;
		}

		return (i>0)?str[0].substring(0, i):"-1";
	}

}
