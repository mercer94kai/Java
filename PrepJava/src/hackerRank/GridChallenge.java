package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {

	public static void main(String[] args) {
		List<String> grid = new ArrayList<String>(Arrays.asList("abc","hjk","mpq","rtv"));
		int flag=0;
		for (int i =0; i< grid.size(); i++) {
			while (grid.size() != grid.get(i).length()) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			gridCheck(grid);
		}
		else {
			System.out.println("NO");
		}
	}
	
	public static void gridCheck(List<String> grid) {
		int flag1 = 0;
//		for (int i =0; i< grid.size(); i++) {
//				grid.set(i, toSorted(grid.get(i)));
//		}
		for (int j =0; j< grid.size(); j++) {
			grid.set(j, toSorted(grid.get(j)));
			char[] col = new char[grid.size()];
			char[] Scol = new char[grid.size()];
			
			for (int k =0; k< grid.size();k++) {
				col[k] = grid.get(k).charAt(j);
				Scol[k] = grid.get(k).charAt(j);
			}
			Arrays.sort(Scol);
			
			if (!Arrays.equals(col, Scol)){
				flag1=1;
				break;
			}
		}
			if (flag1 == 0){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
	}
	
	public static String toSorted(String s) {
		
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String res="";
		for (char c : ch) {
			res=res+c;
		}
		return res;
	}
	
}
