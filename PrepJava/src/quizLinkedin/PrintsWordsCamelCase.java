package quizLinkedin;

import java.util.ArrayList;
import java.util.List;

public class PrintsWordsCamelCase {

	public static void main(String[] args) {
		String str ="thisIsAVeryBizzareCaseForAString";
		int startingIndex=0;
		List<String> list = new ArrayList<>();
		for (int i=0; i<str.length();i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				list.add(str.substring(startingIndex,i));
				startingIndex=i;
			}
		}
		list.add(str.substring(startingIndex,str.length()));
		System.err.println("No of words: "+ list.size());
		System.out.println(list);
		
	}


}
