package PrepJava.src.learning.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class testLinkfunc {

	public static void main(String[] args) {
	
		LinkedList<Integer>  list = new LinkedList<>(Arrays.asList(1,3,4,5,6));
		System.out.println(list);
		System.out.println(list.getFirst());
		list.add(3, 23);
		
		System.out.println(list);
	}

}
