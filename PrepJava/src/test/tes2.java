package test;

import java.util.ArrayList;
import java.util.Arrays;

//
//Current List –{ Shalini,Karishma,Prachi,Pooja,Shalini,Prachi}
//Expected list –{ Shalini,Karishma,Pooja,Prachi}
public class tes2 {

	public static void main(String[] args) {

		String[] c1 = {"e","a","c","x","k"};
		String[] c2=  {"e","a","c","x","k"};
		Arrays.sort(c1);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		if (Arrays.equals(c1, c2)){
			System.out.println("matched");
		}
		else {
			System.out.println("Not matched");
		}
				
}
}
