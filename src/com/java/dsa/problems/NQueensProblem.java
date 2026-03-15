package com.java.dsa.problems;

public class NQueensProblem {

	private static boolean isSafe(int board[][], int row, int col, int n) {

		for (int i = 0; i <= row; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
			if (board[i][j] == 1) {
				return false;
			}
		}

		return true;
	}


	private static boolean solveNQueensProblem(int board[][], int row, int n) {
		if (row == n) {
			return true;
		}

		for (int col = 0; col < n; col++) {
			if (isSafe(board, row, col, n)) {
				board[row][col] = 1;
				if (solveNQueensProblem(board, row + 1, n)) {
					return true;
				}
				board[row][col] = 0;
			}
		}
		return false;
	}

	private static int[][] createBoard(int n) {
		int[][] board = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = 0;
			}
		}
		return board;
	}

	private static void printBoard(int[][] board) {
		for (int[] row : board) {
			for (int cell : row) {
				System.out.print(cell == 1 ? " Q " : " . ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 7;
		int[][] board = createBoard(n);

		if(solveNQueensProblem(board,0,n)){
			printBoard(board);
		}else{
			System.out.println("Queens can not be placed.");
		}
	}
}
