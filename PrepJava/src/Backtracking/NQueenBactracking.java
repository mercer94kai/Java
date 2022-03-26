package Backtracking;

import java.util.Arrays;

public class NQueenBactracking {

	public static void main(String[] args) {
		
		int[][] board = new int[5][5];
		System.out.println(Arrays.deepToString(board));	
		NQueen(board, 0);
		System.out.println(Arrays.deepToString(board));
		}
		
		public static boolean NQueen(int[][] board, int row){
			
			if (row==board.length) {
				return true;
			}
			
			for (int col=0; col<board.length;col++) {
				if (isSafe(board,row,col)) {
					board[row][col]=1;
					if (NQueen(board, row+1)) {
						return true;
					}
					else {
						board[row][col]=0;
					}
				}
			}
			return false;
		}

		private static boolean isSafe(int[][] b, int row, int col) {

			for(int i=row;i>=0;i--){
	            if(b[i][col]==1) {
	                return false;
	            }
	        }

	        // for upper-left diagonal
	        int j=col;
	        for(int i=row;i>=0 && j>=0;i--,j--){
	            if(b[i][j]==1) {
	                return false;
	            }
	        }

	        // for upper-right diagonal
	        j=col;
	        for(int i=row;i>=0 && j<b.length;i--,j++){
	            if(b[i][j]==1)
	                return false;
	        }

	        return true;
		}

}
