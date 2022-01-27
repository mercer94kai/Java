package interviewQues;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "kaifa";
		String s2 = "kafka";
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Both Strings are Anagram of each other");
		}else {
			System.out.println("Both Strings are NOT Anagram of each other");
		}
	}

}
