package by.htp.les07.main;

public class Main17 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 */

	public static void main(String[] args) {
		int[][] ar;
		int n = 6;
		ar = fun(n);
		print(ar);
	}

	public static void print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] fun(int n) {
		int[][] ar = new int[n][n];

		for (int i = 0; i < n; i++) {
			ar[0][i] = 1;
			ar[n - 1][i] = 1;
		}
		for (int i = 1; i < ar.length - 1; i++) {
			ar[i][0] = 1;
			ar[i][n - 1] = 1;
			for (int j = 1; j < ar[i].length - 1; j++) {
				ar[i][j] = 0;
			}
		}

		return ar;
	}

}
