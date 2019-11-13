package by.htp.les07.main;

public class Main13 {

	/*
	 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
	 */

	public static void main(String[] args) {
		int[][] ar;
		int n = 4;
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

		for (int i = 0; i < ar.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < ar[i].length; j++) {
					ar[i][j] = n - j;
				}
			}
		}

		return ar;
	}

}
