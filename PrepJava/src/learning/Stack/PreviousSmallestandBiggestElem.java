package learning.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousSmallestandBiggestElem {
	
	public static void main(String[] args) {
		int[] arr = {4,10,5,8,20,15,3,12};
		previousSmallest(arr);
		System.out.println();
		previosGreater(arr);
		System.out.println();
		nextSmallest(arr);
		System.out.println();
		nextGreatest(arr);
	}
	
	public static void previousSmallest(int[] a) {
		Stack<Integer> s = new Stack<>();
		for (int i=0; i<a.length;i++) {
		while (!s.isEmpty() && s.peek()>=a[i]) {
			s.pop();
		}
		
		if (s.isEmpty()) {
			System.out.print(-1+" ");
		}
		else{
			System.out.print(s.peek()+" ");
		}
		s.push(a[i]);
		}
	}
	
	public static void previosGreater(int[] a) {
		Stack<Integer> s = new Stack<>();
		for (int i=0; i<a.length;i++) {
			while (!s.isEmpty() && s.peek()<=a[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				System.out.print(-1+" ");
			}
			else{
				System.out.print(s.peek()+" ");
			}
			s.push(a[i]);
		}
	}
	
	public static void nextSmallest(int[] a) {
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i=a.length-1; i>=0;i--) {
			while (!s.isEmpty() && s.peek()>=a[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				list.add(-1);
			}
			else {
				list.add(s.peek());
			}
			s.push(a[i]);
		}
		
		for (int j=list.size()-1; j>=0; j--) {
			System.out.print(list.get(j)+" ");
		}
	}
	public static void nextGreatest(int[] a) {
		Stack<Integer> s = new Stack<>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i=a.length-1; i>=0;i--) {
			while (!s.isEmpty() && s.peek()<=a[i]) {
				s.pop();
			}
			if (s.isEmpty()) {
				list.add(-1);
			}
			else {
				list.add(s.peek());
			}
			s.push(a[i]);
		}
		
		for (int j=list.size()-1; j>=0; j--) {
			System.out.print(list.get(j)+" ");
		}
	}
}
