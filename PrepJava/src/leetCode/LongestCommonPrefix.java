package PrepJava.src.leetCode;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] str = {"kaifa","kafka","kaiya", "kaif"};
		
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		int i;
		for (i=0;i< str[0].length(); i++) {
			if (str[0].charAt(i)==str[str.length-1].charAt(i)) {
				continue;
			}
			break;
		}
		if (i>0) {
			System.out.println(str[0].substring(0, i));
		}
		else {
			System.out.println("");
		}
	}

}
