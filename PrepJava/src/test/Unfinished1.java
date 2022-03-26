package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Unfinished1 {


	public static void main(String[] args) {
		
		List<String> ops = new ArrayList<>(Arrays.asList("1 165696469","1 930998040","1 930313308","1 20","3","1 988911195","3"));
		System.out.println(getMax(ops));
	}

	public static List<Integer> getMax(List<String> operations) {

		Stack<Integer> stc = new Stack<>();
		List<Integer> list = new ArrayList<>();

		for (String s : operations) {

			String[] sar=s.split(" ");
			
			switch (Integer.parseInt(sar[0])) {
			case 1: stc.push(Integer.parseInt(sar[1]));
			break;
				
			case 2: stc.pop();
			break;
				
			case 3: list.add(maxElem(stc));
        	break;
        	
        	default: throw new IllegalAccessError("Invalid Parameter");
				
			}
		}

		return list;

	}

	public static int maxElem(Stack<Integer> stc) {
		int big = Integer.MIN_VALUE;
		for (int i: stc) {
			if (big<i) {
				big=i;
			}
		}
		return big;
	}


}
