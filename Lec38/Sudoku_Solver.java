package Lec38;

public class Sudoku_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				        { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
				        { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				         { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
				         { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
				         { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				         { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
				         { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
				         { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		Sudoku(grid, 0, 0);

	}

	public static void Sudoku(int[][] board, int row, int col) {
		if(col==9) {
			row++;
			col=0;
		}
		if(row==9) {
			Display(board);
			return;
		}
		if(board[row][col]!=0) {
			Sudoku(board, row, col+1);
		}
		else {
			for (int val = 1; val <=9; val++) {
				if(isitsafe(board,row,col,val)) {
					board[row][col]=val;
					Sudoku(board, row, col+1);
					board[row][col]=0;
				}
			}
		}

	}

	public static boolean isitsafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		//row
		for (int c = 0; c < board.length; c++) {
			if(board[row][c]==val) {
				return false;
			}
		}
		//col
		for (int r = 0; r < board.length; r++) {
			if(board[r][col]==val) {
				return false;
			}
		}
		// 3*3 Matrix
		int r= row-row%3;
		int c= col-col%3;
		for (int i = r; i < r+3; i++) {
			for (int j = c; j <c+3; j++) {
				if(board[i][j]==val) {
					return false;
				}
			}
			
		}
		return true;
	}

	public static void Display(int[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
