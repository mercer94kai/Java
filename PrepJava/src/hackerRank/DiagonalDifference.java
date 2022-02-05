package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(11,2,4));
		ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(4,5,6));
		ArrayList<Integer> row3 = new ArrayList<>(Arrays.asList(10,8,-12));
		List<List<Integer>> arr = new ArrayList<>(Arrays.asList(row1,row2,row3));
		System.out.println(diagonalDifference(arr));
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		int primeDiag = 0;
        int secnDiag = 0;
        for (int i=0 ;i < arr.size();i++) {
            for (int j=0; j< arr.get(i).size(); j++) {
                if (i==j) {
                primeDiag = primeDiag + arr.get(j).get(j);
                }
            }
        }
        
        for (int i=0 ;i < arr.size();i++) {
            for (int j=0; j< arr.get(i).size(); j++) {
                if ((i+j)==(arr.size()-1)) {
                    secnDiag =secnDiag+arr.get(i).get(j);
                }
                
            }
        }
        return Math.abs(primeDiag-secnDiag);
	}

}
