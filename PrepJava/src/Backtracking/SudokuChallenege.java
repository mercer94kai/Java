package Backtracking;

import java.util.Arrays;

public class SudokuChallenege {

	public static void main(String[] args) {
		
		 int[][] board = new int[][] {
	            { 0, 0, 0, 0, 0, 0, 0, 3, 0 },
	            { 7, 6, 3, 4, 0, 0, 0, 2, 0 },
	            { 0, 8, 0, 0, 3, 9, 1, 6, 7 },
	            { 5, 4, 1, 3, 6, 8, 7, 9, 2 },
	            { 8, 0, 7, 9, 0, 2, 5, 4, 0 },
	            { 0, 9, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 2, 0, 1 },
	            { 9, 7, 4, 1, 0, 5, 0, 8, 3 },
	            { 6, 1, 2, 8, 0, 3, 0, 5, 9 }
	        };
	        
	        if (solveSudoku(board, board.length)) {
	        	System.out.println(Arrays.deepToString(board));
	        }
	        else {
	        	System.out.println("No solution found");
	        }
	}
	
	public static boolean solveSudoku(int[][] board,int n) {
		
		int row =-1;
		int col =-1;
		boolean isEmpty=true;
		
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board.length;j++) {
				if (board[i][j]==0) {
					row=i;
					col=j;
					isEmpty=false;
					break;
				}
			}
			if(!isEmpty) {
				break;
			}
		}
		
		if (isEmpty) {
			return true;
		}
		
		for (int num=1;num<=n;num++) {
			if(isSafe(board,row,col,num)) {
				board[row][col]=num;
				if (solveSudoku(board, n)) {
					return true;
				}
				else {
					board[row][col]=0;
				}
			}
		}
		return false;
	}

	public static boolean isSafe(int[][] board, int row, int col, int num) {
		
		for (int k=0;k<board.length;k++) {
			if(board[row][k]==num) {
				return false;
			}
		}
		
		for (int l=0;l<board.length;l++) {
			if(board[l][col]==num) {
				return false;
			}
		}
		
		int sqrt = (int)Math.sqrt(board.length);
		int startRowInd=row-row%sqrt;
		int startColInd=col-col%sqrt;
		
		for (int m=startRowInd; m<startRowInd+sqrt; m++) {
			for (int p=startColInd; p<startColInd+sqrt; p++) {
				if (board[m][p]==num) {
					return false;
				}
			}
		}
		return true;
	}
}
