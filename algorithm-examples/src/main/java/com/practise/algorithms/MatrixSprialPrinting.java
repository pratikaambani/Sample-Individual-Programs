package com.practise.algorithms;
/**
 * Printing n*m matrix in spiral manners.
 * Input matrix
 * | 1 2 3 |
 * | 4 5 6 |
 * | 7 8 9 |
 * 
 * Output : 123 6987 45
 * @author Pratik Ambani
 *
 */
public class MatrixSprialPrinting {
	public static void main(String[] args) {
		final int R = 3;
		final int C = 3;
		int cnt = 1;
		int Matrix[][] = new int[R][C];

		// fill up elements in matrix
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				Matrix[i][j] = cnt++;

			}
		}

		System.out.println("Normal Printing") ;
		System.out.println("===============") ;
		System.out.println() ;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(" "+Matrix[i][j]) ;

			}
			System.out.println();
		}
		System.out.println("Sprial Printing") ;
		System.out.println("===============") ;
		System.out.println() ;
		sprialPrinting(R, C, Matrix);

	}

	public static void sprialPrinting(int end_row, int end_column,
			int matrix[][]) {

		 int i, start_row = 0, start_column = 0;
		
		while (start_row < end_row && start_column < end_column) {

			// print from upper left to upper right
			for (i = start_column; i < end_column; i++) {
				System.out.print(" " + matrix[start_row][i]);
			}

			// print from right top to right bottom
			start_row++;
			for (i = start_row; i < end_row; i++) {
				System.out.print(" " + matrix[i][end_column - 1]);
			}

			// print from bottom right to bottom left
			end_column--;
			if (start_row < end_row) {
				for (i = end_column - 1; i >= 0; i--) {
					System.out.print(" " + matrix[end_row - 1][i]);
				}
				end_row--;
			}

			// print from left bottom to left top
			if (start_column < end_column) {
				for (i = end_row - 1; i >= start_row; i--) {
					System.out.print(" " + matrix[i][start_column]);
				}
				start_column++;
			}

		}

	}
}
