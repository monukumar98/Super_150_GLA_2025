package Lec38;
public class N_Queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] board = new boolean[n][n];
		NQueen(board, 0, n);

	}

	private static void NQueen(boolean[][] board, int row, int tq) {
		// TODO Auto-generated method stub
		if (tq == 0) {
			Display(board);
			System.out.println();
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isitasfe(board, row, col) == true) {
				board[row][col] = true;
				NQueen(board, row + 1, tq - 1);
				board[row][col] = false;
			}

		}

	}

	public static boolean isitasfe(boolean[][] board, int row, int col) {
		// TODO Auto-generated method stub
		// col
		int r = row;
		while (r >= 0) {
			if (board[r][col]) {
				return false;
			}
			r--;
		}
		// left diagonal
		r = row;
		int c = col;

		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// right diagonal
		r = row;
		c = col;

		while (r >= 0 && c < board.length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

	public static void Display(boolean[][] board) {
		// TODO Auto-generated method stub
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
