package leetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Possiblepermutations {

	public static void main(String[] args) {
		String big = "cbabcacabca";
		String small ="abc";
		int lenbig = big.length();
		int lensmall = small.length();
		ArrayList<String> alist = new ArrayList<>();
		
		for (int i=0; i<lenbig; i++) {
			if ((lensmall+i)<=lenbig) {
				String sb =	big.substring(i,lensmall+i);
				char[] ch = sb.toCharArray();
				Arrays.sort(ch);
				String str = Arrays.toString(ch);
					if (Arrays.toString(small.toCharArray()).equals(str)) {
						alist.add(sb);
					}
			}
		}
		System.out.println(alist.size());
		System.out.println(alist);
	}

}
